/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Doctor;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public interface DoctorDAO extends CrudDAO<Doctor, String>{
    public void getLastID() throws SQLException,ClassNotFoundException;
    public void getLastDoctor();

    public Doctor search(String DoctId) throws ClassNotFoundException, SQLException;
}
