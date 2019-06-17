/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;


import bo.custom.SpecialtypeBO;
import dao.DAOFactory;
import dao.custom.SpecialtypeDAO;
import dto.SpecialtypeDTO;
import entity.Specialtype;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SpecialtypeBOImpl implements SpecialtypeBO{

    SpecialtypeDAO dao=(SpecialtypeDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SPECIALTYPE);

    
    @Override
    public SpecialtypeDTO searchSpecialtype(String DoctId) throws ClassNotFoundException, SQLException {
        Specialtype search=dao.search(DoctId);
        return new SpecialtypeDTO(search.getDoctId(),search.getDoctName(),search.getDescription());
    }
    
    @Override
    public ArrayList<SpecialtypeDTO> getAllSpecialtype() throws ClassNotFoundException, SQLException {
        ArrayList<Specialtype> all=dao.getAll();
        ArrayList<SpecialtypeDTO> allSpecialtype=new ArrayList<>();
        for(Specialtype search:all){
            allSpecialtype.add(new SpecialtypeDTO(search.getDoctId(),search.getDoctName(),search.getDescription()));
        }
        return allSpecialtype;
    }

      
//    @Override
//    public boolean addSpecialtype(SpecialtypeDTO spe) throws ClassNotFoundException, SQLException {
//       return dao.add(new Specialtype(spe.getDoctId(),spe.getDoctName(),spe.getDescription()));
//    }
//
//    @Override
//    public boolean updateSpecialtype(SpecialtypeDTO spe) throws ClassNotFoundException, SQLException {
//       return dao.update(new Specialtype(spe.getDoctId(),spe.getDoctName(),spe.getDescription()));
//    }


    
    
}
