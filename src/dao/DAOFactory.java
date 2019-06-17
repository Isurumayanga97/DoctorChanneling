/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bo.BOFactroy;
import dao.custom.SpecialtypeDAO;
import dao.custom.impl.AppoinmentDAOImpl;
import dao.custom.impl.DoctorDAOImpl;
import dao.custom.impl.PaymentDAOImpl;
import dao.custom.impl.SheduleDAOImpl;
import dao.custom.impl.SpecialtypeDAOImpl;
import dao.custom.impl.UserDAOImpl;

/**
 *
 * @author User
 */
public class DAOFactory {
    
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes{
        DOCTOR,SPECIALTYPE,SHEDULE,USER,APPOINMENT,PAYMENT
    }
    public SuperDAO getDAO(DAOTypes types){
        switch(types){
            case DOCTOR:
                return new DoctorDAOImpl();
            case SPECIALTYPE:
                return new SpecialtypeDAOImpl();
            case SHEDULE:
                return new SheduleDAOImpl();
            case USER:
                return new UserDAOImpl();
            case APPOINMENT:
                return new AppoinmentDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
                default:
                    return null;
        }
    }
}
