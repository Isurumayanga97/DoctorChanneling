/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author User
 */
public class Doctor {
    private String DoctId;
    private String DoctName;
    private String DoctAddress;
    private String DoctIdCardNum;
    private String DoctHospital;
    private String DoctSpecialType;
    private int DoctTel ;
    private String DoctGende;

    public Doctor() {
    }

    public Doctor(String DoctId, String DoctName, String DoctAddress, String DoctIdCardNum, String DoctHospital, String DoctSpecialType, int DoctTel, String DoctGende) {
        this.DoctId = DoctId;
        this.DoctName = DoctName;
        this.DoctAddress = DoctAddress;
        this.DoctIdCardNum = DoctIdCardNum;
        this.DoctHospital = DoctHospital;
        this.DoctSpecialType = DoctSpecialType;
        this.DoctTel = DoctTel;
        this.DoctGende = DoctGende;
    }

    /**
     * @return the DoctId
     */
    public String getDoctId() {
        return DoctId;
    }

    /**
     * @param DoctId the DoctId to set
     */
    public void setDoctId(String DoctId) {
        this.DoctId = DoctId;
    }

    /**
     * @return the DoctName
     */
    public String getDoctName() {
        return DoctName;
    }

    /**
     * @param DoctName the DoctName to set
     */
    public void setDoctName(String DoctName) {
        this.DoctName = DoctName;
    }

    /**
     * @return the DoctAddress
     */
    public String getDoctAddress() {
        return DoctAddress;
    }

    /**
     * @param DoctAddress the DoctAddress to set
     */
    public void setDoctAddress(String DoctAddress) {
        this.DoctAddress = DoctAddress;
    }

    /**
     * @return the DoctIdCardNum
     */
    public String getDoctIdCardNum() {
        return DoctIdCardNum;
    }

    /**
     * @param DoctIdCardNum the DoctIdCardNum to set
     */
    public void setDoctIdCardNum(String DoctIdCardNum) {
        this.DoctIdCardNum = DoctIdCardNum;
    }

    /**
     * @return the DoctHospital
     */
    public String getDoctHospital() {
        return DoctHospital;
    }

    /**
     * @param DoctHospital the DoctHospital to set
     */
    public void setDoctHospital(String DoctHospital) {
        this.DoctHospital = DoctHospital;
    }

    /**
     * @return the DoctSpecialType
     */
    public String getDoctSpecialType() {
        return DoctSpecialType;
    }

    /**
     * @param DoctSpecialType the DoctSpecialType to set
     */
    public void setDoctSpecialType(String DoctSpecialType) {
        this.DoctSpecialType = DoctSpecialType;
    }

    /**
     * @return the DoctTel
     */
    public int getDoctTel() {
        return DoctTel;
    }

    /**
     * @param DoctTel the DoctTel to set
     */
    public void setDoctTel(int DoctTel) {
        this.DoctTel = DoctTel;
    }

    /**
     * @return the DoctGende
     */
    public String getDoctGende() {
        return DoctGende;
    }

    /**
     * @param DoctGende the DoctGende to set
     */
    public void setDoctGende(String DoctGende) {
        this.DoctGende = DoctGende;
    }
    
    
    
    
}
