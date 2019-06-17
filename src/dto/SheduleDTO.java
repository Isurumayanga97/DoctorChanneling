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
public class SheduleDTO {
    
    private String DoctId;
    private String DoctName;
    private String ShedMon;
    private String ShedTue;
    private String ShedWed;
    private String ShedThu;
    private String ShedFri;
    private String ShedSat;
    private String ShedSun;

    public SheduleDTO() {
    }

    public SheduleDTO(String DoctId, String DoctName, String ShedMon, String ShedTue, String ShedWed, String ShedThu, String ShedFri, String ShedSat, String ShedSun) {
        this.DoctId = DoctId;
        this.DoctName = DoctName;
        this.ShedMon = ShedMon;
        this.ShedTue = ShedTue;
        this.ShedWed = ShedWed;
        this.ShedThu = ShedThu;
        this.ShedFri = ShedFri;
        this.ShedSat = ShedSat;
        this.ShedSun = ShedSun;
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
     * @return the ShedMon
     */
    public String getShedMon() {
        return ShedMon;
    }

    /**
     * @param ShedMon the ShedMon to set
     */
    public void setShedMon(String ShedMon) {
        this.ShedMon = ShedMon;
    }

    /**
     * @return the ShedTue
     */
    public String getShedTue() {
        return ShedTue;
    }

    /**
     * @param ShedTue the ShedTue to set
     */
    public void setShedTue(String ShedTue) {
        this.ShedTue = ShedTue;
    }

    /**
     * @return the ShedWed
     */
    public String getShedWed() {
        return ShedWed;
    }

    /**
     * @param ShedWed the ShedWed to set
     */
    public void setShedWed(String ShedWed) {
        this.ShedWed = ShedWed;
    }

    /**
     * @return the ShedThu
     */
    public String getShedThu() {
        return ShedThu;
    }

    /**
     * @param ShedThu the ShedThu to set
     */
    public void setShedThu(String ShedThu) {
        this.ShedThu = ShedThu;
    }

    /**
     * @return the ShedFri
     */
    public String getShedFri() {
        return ShedFri;
    }

    /**
     * @param ShedFri the ShedFri to set
     */
    public void setShedFri(String ShedFri) {
        this.ShedFri = ShedFri;
    }

    /**
     * @return the ShedSat
     */
    public String getShedSat() {
        return ShedSat;
    }

    /**
     * @param ShedSat the ShedSat to set
     */
    public void setShedSat(String ShedSat) {
        this.ShedSat = ShedSat;
    }

    /**
     * @return the ShedSun
     */
    public String getShedSun() {
        return ShedSun;
    }

    /**
     * @param ShedSun the ShedSun to set
     */
    public void setShedSun(String ShedSun) {
        this.ShedSun = ShedSun;
    }
    
    
    
}
