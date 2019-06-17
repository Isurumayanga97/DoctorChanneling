/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactroy;
import bo.custom.DoctorBO;
import dto.DoctorDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DoctorController {
    
    static DoctorBO bo=(DoctorBO) BOFactroy.getInstance().getBO(BOFactroy.BOTyepes.DOCTOR);
    
    public static boolean addDoctor(DoctorDTO ref) throws ClassNotFoundException, SQLException{
        return bo.addDoctor(ref);
    }
    public static boolean updateDoctor(DoctorDTO ref) throws ClassNotFoundException, SQLException{
        return bo.updateDoctor(ref);
    }
    public static boolean deleteDoctoor(String DoctId) throws ClassNotFoundException, SQLException{
        return bo.deleteDoctor(DoctId);
    }
    
    public static DoctorDTO searchDoctor(String DoctId)throws ClassNotFoundException,SQLException{
        return bo.searchDoctor(DoctId);
    }

    public static ArrayList<DoctorDTO> getAllDoctor() throws ClassNotFoundException, SQLException{
        return bo.getAllDoctors();
    }
}
