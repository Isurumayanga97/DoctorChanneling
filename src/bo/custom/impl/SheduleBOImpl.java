/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.SheduleBO;
import dao.DAOFactory;
import dao.custom.SheduleDAO;
import dto.SheduleDTO;
import entity.Shedule;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SheduleBOImpl implements SheduleBO{
    
    SheduleDAO dao=(SheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SHEDULE);

    @Override
    public boolean addShedule(SheduleDTO shed) throws ClassNotFoundException, SQLException {
       return dao.add(new Shedule(shed.getDoctId(),shed.getDoctName(),shed.getShedMon(),shed.getShedTue(),shed.getShedWed(),shed.getShedThu(),shed.getShedFri(),shed.getShedSat(),shed.getShedSun()));
    }

    @Override
    public boolean updateShedule(SheduleDTO shed) throws ClassNotFoundException, SQLException {
       return dao.update(new Shedule(shed.getDoctId(),shed.getDoctName(),shed.getShedMon(),shed.getShedTue(),shed.getShedWed(),shed.getShedThu(),shed.getShedFri(),shed.getShedSat(),shed.getShedSun()));
    }

     @Override
    public SheduleDTO searchShedule(String DoctId) throws ClassNotFoundException, SQLException {
        Shedule search=dao.search(DoctId);
        return new SheduleDTO(search.getDoctId(),search.getDoctName(),search.getShedMon(),search.getShedTue(),search.getShedWed(),search.getShedThu(),search.getShedFri(),search.getShedSat(),search.getShedSun());
    }
    
    @Override
    public ArrayList<SheduleDTO> getAllShedule() throws ClassNotFoundException, SQLException {
       ArrayList<Shedule> all=dao.getAll();
       ArrayList<SheduleDTO> allShedule=new ArrayList();
       for(Shedule sh:all){
           allShedule.add(new SheduleDTO(sh.getDoctId(),sh.getDoctName(),sh.getShedMon(),sh.getShedTue(),sh.getShedWed(),sh.getShedThu(),sh.getShedFri(),sh.getShedSat(),sh.getShedSun()));
       }
       return allShedule;
    }

   

    
    
}
