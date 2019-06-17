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
public class DoctorDTO {
    private String DoctId;
    private String DoctName;
    private String DoctAddress;
    private String DoctIdCardNum;
    private String DoctHospital;
    private String DoctSpecialType;
    private int DoctTel ;
    private String DoctGende;

    public DoctorDTO() {
    }

    public DoctorDTO(String DoctId, String DoctName, String DoctAddress, String DoctIdCardNum, String DoctHospital, String DoctSpecialType, int DoctTel, String DoctGende) {
        this.DoctId = DoctId;
        this.DoctName = DoctName;
        this.DoctAddress = DoctAddress;
        this.DoctIdCardNum = DoctIdCardNum;
        this.DoctHospital = DoctHospital;
        this.DoctSpecialType = DoctSpecialType;
        this.DoctTel = DoctTel;
        this.DoctGende = DoctGende;
    }

    public String getDoctId() {
        return DoctId;
    }

    public void setDoctId(String DoctId) {
        this.DoctId = DoctId;
    }

    public String getDoctName() {
        return DoctName;
    }

    public void setDoctName(String DoctName) {
        this.DoctName = DoctName;
    }

    public String getDoctAddress() {
        return DoctAddress;
    }

    public void setDoctAddress(String DoctAddress) {
        this.DoctAddress = DoctAddress;
    }

    public String getDoctIdCardNum() {
        return DoctIdCardNum;
    }

    public void setDoctIdCardNum(String DoctIdCardNum) {
        this.DoctIdCardNum = DoctIdCardNum;
    }

    public String getDoctHospital() {
        return DoctHospital;
    }

    public void setDoctHospital(String DoctHospital) {
        this.DoctHospital = DoctHospital;
    }

    public String getDoctSpecialType() {
        return DoctSpecialType;
    }

    public void setDoctSpecialType(String DoctSpecialType) {
        this.DoctSpecialType = DoctSpecialType;
    }

    public int getDoctTel() {
        return DoctTel;
    }

    public void setDoctTel(int DoctTel) {
        this.DoctTel = DoctTel;
    }

    public String getDoctGende() {
        return DoctGende;
    }

    public void setDoctGende(String DoctGende) {
        this.DoctGende = DoctGende;
    }
    
    
    
}
