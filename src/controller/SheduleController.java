/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.SheduleBO;
import dto.SheduleDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SheduleController {
    
    static SheduleBO bo= (SheduleBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.SHEDULE);
    
    public static boolean addShedule(SheduleDTO shed) throws ClassNotFoundException, SQLException{
        return bo.addShedule(shed);
    }
    public static boolean updateShedule(SheduleDTO DoctId) throws ClassNotFoundException, SQLException{
        return bo.updateShedule(DoctId);
    }
    
    public static SheduleDTO searchShedule(String DoctId) throws SQLException, ClassNotFoundException {
        return bo.searchShedule(DoctId);
    }
    
    public static ArrayList<SheduleDTO> getAllShedule() throws ClassNotFoundException, SQLException{
        return bo.getAllShedule();
    }
}
