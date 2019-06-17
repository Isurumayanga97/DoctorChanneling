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
public class AppoinmentDTO {
    private String appoinmentNum;
    private String patientName;
    private String patientId;
    private String doctorName;
    private String description;
    private String appoinmentdate;
    private String shedule;
    private int patientTel;

    public AppoinmentDTO() {
    }

    public AppoinmentDTO(String appoinmentNum, String patientName, String patientId, String doctorName, String description, String appoinmentdate, String shedule, int patientTel) {
        this.appoinmentNum = appoinmentNum;
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.description = description;
        this.appoinmentdate = appoinmentdate;
        this.shedule = shedule;
        this.patientTel = patientTel;
    }

    
    public String getAppoinmentNum() {
        return appoinmentNum;
    }

   
    public void setAppoinmentNum(String appoinmentNum) {
        this.appoinmentNum = appoinmentNum;
    }

    
    public String getPatientName() {
        return patientName;
    }

   
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    
    public String getPatientId() {
        return patientId;
    }

  
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

   
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppoinmentdate() {
        return appoinmentdate;
    }

    
    public void setAppoinmentdate(String appoinmentdate) {
        this.appoinmentdate = appoinmentdate;
    }

    public String getShedule() {
        return shedule;
    }

    
    public void setShedule(String shedule) {
        this.shedule = shedule;
    }

    public int getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(int patientTel) {
        this.patientTel = patientTel;
    }
    
    
}
