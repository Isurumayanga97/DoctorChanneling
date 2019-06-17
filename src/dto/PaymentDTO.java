/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author User
 */
public class PaymentDTO {
    private String appoinmnetNum;
    private double hospitalaCharge;
    private double doctorCharge;
    private double total;
    private String date;

    public PaymentDTO() {
    }

    public PaymentDTO(String appoinmnetNum, double hospitalaCharge, double doctorCharge, double total, String date) {
        this.appoinmnetNum = appoinmnetNum;
        this.hospitalaCharge = hospitalaCharge;
        this.doctorCharge = doctorCharge;
        this.total = total;
        this.date = date;
    }

    /**
     * @return the appoinmnetNum
     */
    public String getAppoinmnetNum() {
        return appoinmnetNum;
    }

    /**
     * @param appoinmnetNum the appoinmnetNum to set
     */
    public void setAppoinmnetNum(String appoinmnetNum) {
        this.appoinmnetNum = appoinmnetNum;
    }

    /**
     * @return the hospitalaCharge
     */
    public double getHospitalaCharge() {
        return hospitalaCharge;
    }

    /**
     * @param hospitalaCharge the hospitalaCharge to set
     */
    public void setHospitalaCharge(double hospitalaCharge) {
        this.hospitalaCharge = hospitalaCharge;
    }

    /**
     * @return the doctorCharge
     */
    public double getDoctorCharge() {
        return doctorCharge;
    }

    /**
     * @param doctorCharge the doctorCharge to set
     */
    public void setDoctorCharge(double doctorCharge) {
        this.doctorCharge = doctorCharge;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}
