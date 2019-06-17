/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.DoctorDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface DoctorBO extends SuperBO{
    public boolean addDoctor(DoctorDTO ref) throws ClassNotFoundException,SQLException;
    
    public boolean updateDoctor(DoctorDTO ref) throws ClassNotFoundException,SQLException;
    
    public boolean deleteDoctor(String id) throws ClassNotFoundException,SQLException;
    
    public DoctorDTO searchDoctor(String DoctId)throws SQLException,ClassNotFoundException;
    
    public ArrayList<DoctorDTO> getAllDoctors() throws ClassNotFoundException,SQLException;

    

    
    
}
