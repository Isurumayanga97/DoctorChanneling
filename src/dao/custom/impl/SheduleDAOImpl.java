/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.SheduleDAO;
import entity.Shedule;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SheduleDAOImpl implements SheduleDAO{

   

    @Override
    public boolean add(Shedule ref) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("Insert into shedule values(?,?,?,?,?,?,?,?,?)",
               ref.getDoctId(),ref.getDoctName(),ref.getShedMon(),ref.getShedTue(),ref.getShedWed(),ref.getShedThu(),ref.getShedFri(),ref.getShedSat(),ref.getShedSun());
    }

    @Override
    public boolean update(Shedule ref) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("update shedule set ShedMon=?,ShedTue=?,ShedWed=?,ShedThu=?,ShedFri=?,ShedSat=?,ShedSun=? where DoctId=?",ref.getShedMon(),ref.getShedTue(),ref.getShedWed(),ref.getShedThu(),ref.getShedFri(),ref.getShedSat(),ref.getShedSun(),ref.getDoctId());
    }

   @Override
    public Shedule search(String DoctId) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from shedule where DoctId=?", DoctId);
        Shedule shedule=null;
        while(rst.next()){
            shedule=new Shedule(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
        }
        return shedule;
    }

    @Override
    public ArrayList<Shedule> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from shedule");
        ArrayList allShedule=new ArrayList();
        while(rst.next()){
            allShedule.add(new Shedule(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9)));
        }
        return allShedule;
    }
    
     @Override
    public void getLastId() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastShedule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrudTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
