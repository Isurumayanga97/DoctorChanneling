/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;


import bo.custom.impl.AppoinmentBOImpl;
import bo.custom.impl.DoctorBOImpl;
import bo.custom.impl.PaymentBOImpl;
import bo.custom.impl.SheduleBOImpl;
import bo.custom.impl.SpecialtypeBOImpl;
import bo.custom.impl.UserBOImpl;

/**
 *
 * @author User
 */
public class BOFactroy {

    private static BOFactroy boFactory;
    
    public BOFactroy() {
    }
    
    public static BOFactroy getInstance(){
        if(boFactory==null){
            boFactory=new BOFactroy();
        }
        return boFactory;
    } 
    
    public enum BOTyepes{
        DOCTOR,SPECIALTYPE,SHEDULE,USER, APPOINMENT,PAYMENT
    }
    
    public SuperBO getBO(BOTyepes types){
        switch (types){
            case DOCTOR:
                return new DoctorBOImpl();
            case SPECIALTYPE:
                return new SpecialtypeBOImpl();
            case SHEDULE:
                return new SheduleBOImpl();
            case USER:
                return new UserBOImpl();
            case APPOINMENT:
                return new AppoinmentBOImpl();
            case PAYMENT:
                return  new PaymentBOImpl();
            default:
                return null;
        }
    }
}
