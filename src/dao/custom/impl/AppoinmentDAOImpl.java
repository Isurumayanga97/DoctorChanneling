/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.AppoinmentDAO;
import entity.Appoinment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AppoinmentDAOImpl implements AppoinmentDAO{

    
    @Override
    public boolean add(Appoinment ref) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("Insert into appoinment values(?,?,?,?,?,?,?,?)",ref.getAppoinmentNum(),ref.getPatientName(),ref.getPatientId(),ref.getDoctorName(),ref.getDescription(),ref.getAppoinmentdate(),ref.getShedule(),ref.getPatientTel());
    }

    @Override
    public boolean update(Appoinment ref) throws ClassNotFoundException, SQLException {
            return CrudUtil.executeUpdate("update appoinment set PatientName=?,PatientIdNum=?,DoctorName=?,Description=?,AppoinmentDate=?,Shedule=?,PatientTel=? where AppoinmentNum=?", ref.getPatientName(),ref.getPatientId(),ref.getDoctorName(),ref.getDescription(),ref.getAppoinmentdate(),ref.getShedule(),ref.getPatientTel(),ref.getAppoinmentNum());
         }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from appoinment where AppoinmentNum=?",id);
    }

    @Override
    public Appoinment search(String id) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from appoinment where AppoinmentNum=?", id);
        Appoinment appoinment=null;
        while(rst.next()){
            appoinment=new Appoinment(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getInt(8));
        }
        return appoinment;
    }

    @Override
    public ArrayList<Appoinment> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from appoinment");
        ArrayList<Appoinment> allAppoinment=new ArrayList();
        while(rst.next()){
            allAppoinment.add(new Appoinment(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getInt(8)));
        }
        return allAppoinment;
    }
    
    @Override
    public void getLastID() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastAppoinment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrudTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
