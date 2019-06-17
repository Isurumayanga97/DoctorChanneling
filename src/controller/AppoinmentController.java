/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.AppoinmentBO;
import dto.AppoinmentDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AppoinmentController {
    static AppoinmentBO bo=(AppoinmentBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.APPOINMENT);
    
    public static boolean addAppoinment(AppoinmentDTO ref)throws ClassNotFoundException,SQLException{
        return bo.addAppoinment(ref);
    }
    
    public static boolean updateAppoinment(AppoinmentDTO ref)throws ClassNotFoundException,SQLException{
        return bo.updateAppoinment(ref);
    }
    
    public static boolean deleteAppoinment(String id)throws ClassNotFoundException,SQLException{
        return bo.deleteAppoinment(id);
    }
    
    public static AppoinmentDTO searchAppoinment(String id)throws ClassNotFoundException,SQLException{
        return bo.searchAppoinment(id);
    }
    
    public static ArrayList<AppoinmentDTO> getAllAppoinment()throws ClassNotFoundException,SQLException{
        return bo.getAllAppoinment();
    }
}
