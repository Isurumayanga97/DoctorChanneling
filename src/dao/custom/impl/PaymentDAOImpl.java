/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.PaymentDAO;
import entity.Payment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PaymentDAOImpl implements PaymentDAO{


    @Override
    public boolean add(Payment t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into payment values(?,?,?,?,?)", t.getAppoinmnetNum(),t.getHospitalaCharge(),t.getDoctorCharge(),t.getTotal(),t.getDate());
    }

    @Override
    public boolean update(Payment t) throws ClassNotFoundException, SQLException {
      return CrudUtil.executeUpdate("update payment set HostCharge=?,DoctCharge=?,Total=?,Date=? where AppoinmentNum=?",t.getAppoinmnetNum(),t.getHospitalaCharge(),t.getDoctorCharge(),t.getTotal(),t.getDate());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from payment where AppoinmentNum=?", id);
    }

    @Override
    public Payment search(String id) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from payment where AppoinmentNum=?", id);
        Payment payment=null;
        while(rst.next()){
           payment=new Payment(rst.getString(1),rst.getDouble(2),rst.getDouble(3),rst.getDouble(4),rst.getString(5));
        }
        return payment;
    }

    @Override
    public ArrayList<Payment> getAll() throws ClassNotFoundException, SQLException {
     ResultSet rst=CrudUtil.executeQuery("select * from payment");
     ArrayList<Payment> allPayment=new ArrayList();
     while(rst.next()){
         allPayment.add(new Payment(rst.getString(1),rst.getDouble(2),rst.getDouble(3),rst.getDouble(4),rst.getString(5)));
     }
     return allPayment;
    }
     @Override
    public void getLastId() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastPayemnt() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrudTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
