/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.UserBO;
import dao.DAOFactory;
import dao.custom.UserDAO;
import dto.UserDTO;
import entity.User;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserBOImpl implements UserBO{

    UserDAO dao=(UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    
    @Override
    public boolean addUser(UserDTO use) throws ClassNotFoundException, SQLException {
        return dao.add(new User(use.getUserId(),use.getWorkDay(),use.getTimePeri(),use.getUserName(),use.getUserIdNum(),use.getUserAdd(),use.getUserBirth(),use.getUserSal()));
    }

    @Override
    public boolean update(UserDTO use) throws ClassNotFoundException, SQLException {
       return dao.update(new User(use.getUserId(),use.getWorkDay(),use.getTimePeri(),use.getUserName(),use.getUserIdNum(),use.getUserAdd(),use.getUserBirth(),use.getUserSal()));
    }

    @Override
    public boolean deleteUser(String UserId) throws ClassNotFoundException, SQLException {
        return dao.delete(UserId);
    }

    @Override
    public UserDTO searchUser(String DoctId) throws SQLException, ClassNotFoundException {
       User search=dao.search(DoctId);
       return new UserDTO(search.getUserId(),search.getWorkDay(),search.getTimePeri(),search.getUserName(),search.getUserIdNum(),search.getUserAdd(),search.getUserBirth(),search.getUserSal());
    }
    
    @Override
    public ArrayList<UserDTO> getAllUser() throws ClassNotFoundException, SQLException {
       ArrayList<User> all=dao.getAll();
       ArrayList<UserDTO> allUser=new ArrayList<>();
       for(User us:all){
           allUser.add(new UserDTO(us.getUserId(),us.getWorkDay(),us.getTimePeri(),us.getUserName(),us.getUserIdNum(),us.getUserAdd(),us.getUserBirth(),us.getUserSal()));
       }
       return allUser;
    }

   
    
    
}
