/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.AppoinmentDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface AppoinmentBO extends SuperBO{

    public boolean addAppoinment(AppoinmentDTO ref)throws ClassNotFoundException,SQLException;

    public boolean updateAppoinment(AppoinmentDTO ref)throws ClassNotFoundException,SQLException;

    public boolean deleteAppoinment(String id)throws ClassNotFoundException,SQLException;

    public AppoinmentDTO searchAppoinment(String id)throws ClassNotFoundException,SQLException;

    public ArrayList<AppoinmentDTO> getAllAppoinment()throws ClassNotFoundException,SQLException;
    
}
