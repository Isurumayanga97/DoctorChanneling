/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.DoctorDAO;
import entity.Doctor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DoctorDAOImpl implements DoctorDAO{

    
    @Override
    public boolean add(Doctor ref) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("Insert into doctor values(?,?,?,?,?,?,?,?)",ref.getDoctId(),ref.getDoctName(),ref.getDoctAddress(),ref.getDoctIdCardNum(),ref.getDoctHospital(),ref.getDoctSpecialType(),ref.getDoctTel(),ref.getDoctGende());
    }

    @Override
    public boolean update(Doctor ref) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("update doctor set DoctName=?,DoctAddress=?,DoctIdCardNum=?,DoctHospital=?,DoctSpecialType=?,DoctTel=? where DoctId=?",ref.getDoctName(),ref.getDoctAddress(),ref.getDoctIdCardNum(),ref.getDoctHospital(),ref.getDoctSpecialType(),ref.getDoctTel(),ref.getDoctId());
    }

    @Override
    public boolean delete(String DoctId) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from doctor where DoctId=?", DoctId);
    }

    @Override
    public Doctor search(String DoctId) throws ClassNotFoundException, SQLException{
        ResultSet rst=CrudUtil.executeQuery("select * from doctor where DoctId=?", DoctId);
        Doctor doctor=null;
        while(rst.next()){
            doctor=new Doctor(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getInt(7),rst.getString(8));
        }
        return doctor;
      
    }
    
    @Override
    public ArrayList<Doctor> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from Doctor");
        ArrayList<Doctor> allDoctors=new ArrayList();
        while(rst.next()){
            allDoctors.add(new Doctor(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getInt(7),rst.getString(8)));
        }
        return allDoctors;
    }
    
    @Override
    public void getLastID() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getLastDoctor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void CrudTest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
    
}
