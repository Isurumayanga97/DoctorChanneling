/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Specialtype;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public interface SpecialtypeDAO extends CrudDAO<Specialtype, String>{
   public void getLastId()throws SQLException,ClassNotFoundException;
   public void getLastSpecialtype();

    
}
