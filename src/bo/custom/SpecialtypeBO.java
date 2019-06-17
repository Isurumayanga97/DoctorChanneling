/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.SpecialtypeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface SpecialtypeBO extends SuperBO{
   
    public SpecialtypeDTO searchSpecialtype(String DoctId)throws ClassNotFoundException,SQLException;
    
    public ArrayList<SpecialtypeDTO> getAllSpecialtype()throws ClassNotFoundException,SQLException;

//    public boolean addSpecialtype(SpecialtypeDTO spe)throws ClassNotFoundException,SQLException;
//    
//    public boolean updateSpecialtype(SpecialtypeDTO spe)throws ClassNotFoundException,SQLException;
// 

    

    

    

    
    
}
