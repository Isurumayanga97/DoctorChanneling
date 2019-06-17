/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.DoctorBO;
import dao.DAOFactory;
import dao.custom.DoctorDAO;
import dto.DoctorDTO;
import entity.Doctor;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DoctorBOImpl implements DoctorBO {

    DoctorDAO dao=(DoctorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
    
    
    @Override
    public boolean addDoctor(DoctorDTO ref) throws ClassNotFoundException, SQLException {
       return dao.add(new Doctor(ref.getDoctId(),ref.getDoctName(),ref.getDoctAddress(),ref.getDoctIdCardNum(),ref.getDoctHospital(),ref.getDoctSpecialType(),ref.getDoctTel(),ref.getDoctGende()));
    }

    @Override
    public boolean updateDoctor(DoctorDTO ref) throws ClassNotFoundException, SQLException {
       return dao.update(new Doctor(ref.getDoctId(),ref.getDoctName(),ref.getDoctAddress(),ref.getDoctIdCardNum(),ref.getDoctHospital(),ref.getDoctSpecialType(),ref.getDoctTel(),ref.getDoctGende()));
    }

    @Override
    public boolean deleteDoctor(String DoctId) throws ClassNotFoundException, SQLException {
        return dao.delete(DoctId);
    }

    @Override
    public DoctorDTO searchDoctor(String DoctId) throws SQLException, ClassNotFoundException {
       Doctor search=dao.search(DoctId);
       return new DoctorDTO(search.getDoctId(),search.getDoctName(),search.getDoctAddress(),search.getDoctIdCardNum(),search.getDoctHospital(),search.getDoctSpecialType(),search.getDoctTel(),search.getDoctGende());
    }
    
    @Override
    public ArrayList<DoctorDTO> getAllDoctors() throws ClassNotFoundException, SQLException {
        ArrayList<Doctor> all=dao.getAll();
        ArrayList<DoctorDTO> allDoctors =new ArrayList<>();
        for (Doctor doctor : all) {
            allDoctors.add(new DoctorDTO(doctor.getDoctId(),doctor.getDoctName(),doctor.getDoctAddress(),doctor.getDoctIdCardNum(),doctor.getDoctHospital(),doctor.getDoctSpecialType(),doctor.getDoctTel(),doctor.getDoctGende()));    
        }
        return allDoctors;
    }
    
}
