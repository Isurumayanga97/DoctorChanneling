/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.UserBO;
import dto.UserDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserController {
    static UserBO bo=(UserBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.USER);
    
    public static boolean addUser(UserDTO use)throws ClassNotFoundException,SQLException{
        return bo.addUser(use);
    }
    public static boolean updateUser(UserDTO use)throws ClassNotFoundException,SQLException{
        return bo.update(use);
    }
    public static boolean deleteUser(String UserId)throws ClassNotFoundException,SQLException{
        return bo.deleteUser(UserId);       
    }
    
     public static UserDTO searchSpecialtype(String UserId) throws SQLException, ClassNotFoundException {
        return bo.searchUser(UserId);
    }
    
    public static ArrayList<UserDTO> getAllUser()throws ClassNotFoundException,SQLException{
        return bo.getAllUser();
    }
}
