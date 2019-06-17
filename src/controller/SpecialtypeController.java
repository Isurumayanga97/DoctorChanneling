/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.SpecialtypeBO;
import dto.SpecialtypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SpecialtypeController {
    
    static SpecialtypeBO bo=(SpecialtypeBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.SPECIALTYPE);
    

     public static SpecialtypeDTO searchSpecialtype(String DoctId) throws SQLException, ClassNotFoundException {
        return bo.searchSpecialtype(DoctId);
    }
    
    public static ArrayList<SpecialtypeDTO> getAllSpecialtype() throws ClassNotFoundException, SQLException{
        return bo.getAllSpecialtype();
        
    }
    
    
 //    public static boolean addSpecialtype(SpecialtypeDTO spe) throws ClassNotFoundException, SQLException{
//        return bo.addSpecialtype(spe);
//    }
//    public static boolean updateSpecialtype(SpecialtypeDTO spe) throws ClassNotFoundException, SQLException{
//        return bo.updateSpecialtype(spe);
//    }
    
//     public static boolean deleteSpecialtype(String SpeTypeId) throws ClassNotFoundException, SQLException{
//        return bo.deleteSpecialtype(SpeTypeId);
//    }
    
    
}
