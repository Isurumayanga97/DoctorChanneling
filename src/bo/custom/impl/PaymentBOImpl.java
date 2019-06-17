/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.PaymentBO;
import dao.DAOFactory;
import dao.custom.PaymentDAO;
import dto.PaymentDTO;
import entity.Payment;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PaymentBOImpl implements PaymentBO{

     PaymentDAO dao=(PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    
   
    @Override
    public boolean addPayment(PaymentDTO pay) throws SQLException, ClassNotFoundException {
       return dao.add(new Payment(pay.getAppoinmnetNum(),pay.getHospitalaCharge(),pay.getDoctorCharge(),pay.getTotal(),pay.getDate()));
    }

    @Override
    public boolean updatePayment(PaymentDTO use) throws SQLException, ClassNotFoundException {
       return dao.update(new Payment(use.getAppoinmnetNum(),use.getHospitalaCharge(),use.getDoctorCharge(),use.getTotal(),use.getDate()));
    }

    @Override
    public boolean deletePayment(String id) throws SQLException, ClassNotFoundException {
        return dao.delete(id);
    }

    @Override
    public PaymentDTO searchPayment(String id) throws SQLException, ClassNotFoundException {
        Payment search=dao.search(id);
        return new PaymentDTO(search.getAppoinmnetNum(),search.getHospitalaCharge(),search.getDoctorCharge(),search.getTotal(),search.getDate());
    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() throws SQLException, ClassNotFoundException {
        ArrayList<Payment> all=dao.getAll();
       ArrayList<PaymentDTO> allPay=new ArrayList<>();
       for(Payment py:all){
           allPay.add(new PaymentDTO(py.getAppoinmnetNum(),py.getHospitalaCharge(),py.getDoctorCharge(),py.getTotal(),py.getDate()));
       }
       return allPay;
    }

    
}
