/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.UserDAO;
import entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserDAOImpl implements UserDAO{

   
    @Override
    public boolean add(User t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("Insert into user values(?,?,?,?,?,?,?,?)",t.getUserId(), t.getWorkDay(),t.getTimePeri(),t.getUserName(),t.getUserIdNum(),t.getUserAdd(),t.getUserBirth(),t.getUserSal());
    }

    @Override
    public boolean update(User t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update user set WorkDay=?,TimePeri=?,UserName=?,UserIdNum=?,UserAdd=?,UserBirth=?,UserSal=? where UserId=?", t.getWorkDay(),t.getTimePeri(),t.getUserName(),t.getUserIdNum(),t.getUserAdd(),t.getUserBirth(),t.getUserSal(),t.getUserId());
    }

    @Override
    public boolean delete(String UserId) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("delete from user where UserId=?", UserId );
    }

    @Override
    public User search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from user where UserId=?", t);
        User user=null;
        while(rst.next()){
            user=new User(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getDouble(8));
        }return user;
    }

    
    @Override
    public ArrayList<User> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtil.executeQuery("select * from user");
        ArrayList<User> allUser=new ArrayList<>();
        while(rst.next()){
            allUser.add(new User(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getDouble(8)));
        }
        return allUser;
    }
    
     @Override
    public void getLastId() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrudTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
