/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.UserDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface UserBO extends SuperBO{

    public boolean addUser(UserDTO use) throws ClassNotFoundException,SQLException;

    public boolean update(UserDTO use)throws ClassNotFoundException,SQLException;

    public boolean deleteUser(String UserId)throws ClassNotFoundException,SQLException;

    public UserDTO searchUser(String DoctId)throws SQLException,ClassNotFoundException;
    
    public ArrayList<UserDTO> getAllUser()throws ClassNotFoundException,SQLException;

    
    
}
