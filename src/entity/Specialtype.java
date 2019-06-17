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
public class Specialtype {
    private String DoctId;
    private String DoctName;
    private String Description;

    public Specialtype() {
    }

    public Specialtype(String DoctId, String DoctName, String Description) {
        this.DoctId = DoctId;
        this.DoctName = DoctName;
        this.Description = Description;
    }

    /**
     * @return the SpeTypeId
     */
   

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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
