/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Appoinment;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public interface AppoinmentDAO extends CrudDAO<Appoinment, String>{
    public void getLastID()throws SQLException,ClassNotFoundException;
    public void getLastAppoinment();
}
