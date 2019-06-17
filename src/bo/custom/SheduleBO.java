/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.SheduleDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface SheduleBO extends SuperBO{

    public boolean addShedule(SheduleDTO shed)throws ClassNotFoundException,SQLException;

    public boolean updateShedule(SheduleDTO shed)throws ClassNotFoundException,SQLException;

    public SheduleDTO searchShedule(String DoctId)throws ClassNotFoundException,SQLException;
    
    public ArrayList<SheduleDTO> getAllShedule() throws ClassNotFoundException,SQLException;

    
    
}
