/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.PaymentDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface PaymentBO extends SuperBO {

    public boolean addPayment(PaymentDTO pay) throws ClassNotFoundException,SQLException;

    public boolean updatePayment(PaymentDTO use)throws ClassNotFoundException,SQLException;

    public boolean deletePayment(String id)throws ClassNotFoundException,SQLException;

    public PaymentDTO searchPayment(String id)throws ClassNotFoundException,SQLException;

    public ArrayList<PaymentDTO> getAllPayment()throws ClassNotFoundException,SQLException;
    
}
