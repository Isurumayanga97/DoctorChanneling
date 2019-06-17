/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.AppoinmentBO;
import dao.DAOFactory;
import dao.custom.AppoinmentDAO;
import dto.AppoinmentDTO;
import entity.Appoinment;
import java.sql.SQLException;
import java.util.ArrayList;
import view.Apponmnet;

/**
 *
 * @author User
 */
public class AppoinmentBOImpl implements AppoinmentBO{

    AppoinmentDAO dao=(AppoinmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINMENT);
    
    @Override
    public boolean addAppoinment(AppoinmentDTO ref) throws ClassNotFoundException, SQLException {
    return dao.add(new Appoinment(ref.getAppoinmentNum(),ref.getPatientName(),ref.getPatientId(),ref.getDoctorName(),ref.getDescription(),ref.getAppoinmentdate(),ref.getShedule(),ref.getPatientTel()));
    }

    @Override
    public boolean updateAppoinment(AppoinmentDTO ref) throws ClassNotFoundException, SQLException {
       return dao.update(new Appoinment(ref.getAppoinmentNum(),ref.getPatientName(),ref.getPatientId(),ref.getDoctorName(),ref.getDescription(),ref.getAppoinmentdate(),ref.getShedule(),ref.getPatientTel()));
    }

    @Override
    public boolean deleteAppoinment(String id) throws ClassNotFoundException, SQLException {
       return dao.delete(id);
    }

    @Override
    public AppoinmentDTO searchAppoinment(String id) throws ClassNotFoundException, SQLException {
        Appoinment search=dao.search(id);
        return new AppoinmentDTO(search.getAppoinmentNum(),search.getPatientName(),search.getPatientId(),search.getDoctorName(),search.getDescription(),search.getAppoinmentdate(),search.getShedule(),search.getPatientTel());
    }

    @Override
    public ArrayList<AppoinmentDTO> getAllAppoinment() throws ClassNotFoundException, SQLException {
        ArrayList<Appoinment> all=dao.getAll();
        ArrayList<AppoinmentDTO> allAppoinmnet=new ArrayList<>();
        for(Appoinment s:all){
            allAppoinmnet.add(new AppoinmentDTO(s.getAppoinmentNum(),s.getPatientName(),s.getPatientId(),s.getDoctorName(),s.getDescription(),s.getAppoinmentdate(),s.getShedule(),s.getPatientTel()));
        }
        return allAppoinmnet;
    }
    
}
