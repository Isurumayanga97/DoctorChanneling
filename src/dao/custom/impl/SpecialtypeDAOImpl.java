/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.SpecialtypeDAO;
import dto.SpecialtypeDTO;
import entity.Specialtype;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SpecialtypeDAOImpl implements SpecialtypeDAO{

 
     @Override
    public Specialtype search(String DoctId){
        try {
            ResultSet rst=CrudUtil.executeQuery("select * from doctor where DoctId=?", DoctId);
            Specialtype specialtype=null;
            while(rst.next()){
                specialtype=new Specialtype(rst.getString(1),rst.getString(2),rst.getString(3));
            }
            return specialtype;
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return null;
      
    }
    

    @Override
    public ArrayList<Specialtype> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from specialtype");
        ArrayList<Specialtype> allspecialtype=new ArrayList();
        while(rst.next()){
            allspecialtype.add(new Specialtype(rst.getString(1),rst.getString(2),rst.getString(3)));
        }
        return allspecialtype;
    }
    
    @Override
    public void getLastId() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastSpecialtype() {
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

    @Override
    public boolean add(Specialtype t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Specialtype t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
//    @Override
//    public boolean add(Specialtype spe) throws ClassNotFoundException, SQLException {
//        return CrudUtil.executeUpdate("Insert into specialtype values(?,?,?)",spe.getDoctId(),spe.getDoctName(),spe.getDescription());
//    }
//
//    @Override
//    public boolean update(Specialtype spe) throws ClassNotFoundException, SQLException {
//        return CrudUtil.executeUpdate("update specialtype set Description=? where DoctId=?",spe.getDescription(),spe.getDoctId());
//    }

    
}
