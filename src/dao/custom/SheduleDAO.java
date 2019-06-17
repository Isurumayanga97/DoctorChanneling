/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Shedule;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public interface SheduleDAO extends CrudDAO<Shedule, String>{
    public void getLastId()throws SQLException,ClassNotFoundException;
    public void getLastShedule();
}
