/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.PaymentBO;
import dto.PaymentDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PaymentController {
    static PaymentBO bo=(PaymentBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.PAYMENT);
    
    public static boolean addPayment(PaymentDTO pay)throws ClassNotFoundException,SQLException{
        return bo.addPayment(pay);
    }
    public static boolean updatePayment(PaymentDTO use)throws ClassNotFoundException,SQLException{
        return bo.updatePayment(use);
    }
    public static boolean deletePayment(String id)throws ClassNotFoundException,SQLException{
        return bo.deletePayment(id);       
    }
    
     public static PaymentDTO searchPayment(String id) throws SQLException, ClassNotFoundException {
        return bo.searchPayment(id);
    }
    
    public static ArrayList<PaymentDTO> getAllPayment()throws ClassNotFoundException,SQLException{
        return bo.getAllPayment();
    }

   
}
