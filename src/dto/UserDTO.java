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
public class UserDTO {
    private String UserId;
    private String WorkDay;
    private String TimePeri;
    private String UserName;
    private String UserIdNum;
    private String UserAdd;
    private String UserBirth;
    private double UserSal;

    public UserDTO() {
    }

    public UserDTO(String UserId,String WorkDay, String TimePeri,  String UserName, String UserIdNum, String UserAdd, String UserBirth, double UserSal) {
        this.UserId = UserId;
        this.WorkDay = WorkDay;
        this.TimePeri = TimePeri;
        this.UserName = UserName;
        this.UserIdNum = UserIdNum;
        this.UserAdd = UserAdd;
        this.UserBirth = UserBirth;
        this.UserSal = UserSal;
    }

    /**
     * @return the UserId
     */
    public String getUserId() {
        return UserId;
    }

    /**
     * @param UserId the UserId to set
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }
    
    /**
     * @return the WorkDay
     */
    public String getWorkDay() {
        return WorkDay;
    }

    /**
     * @param WorkDay the WorkDay to set
     */
    public void setWorkDay(String WorkDay) {
        this.WorkDay = WorkDay;
    }

    /**
     * @return the TimePeri
     */
    public String getTimePeri() {
        return TimePeri;
    }

    /**
     * @param TimePeri the TimePeri to set
     */
    public void setTimePeri(String TimePeri) {
        this.TimePeri = TimePeri;
    }

    

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserIdNum
     */
    public String getUserIdNum() {
        return UserIdNum;
    }

    /**
     * @param UserIdNum the UserIdNum to set
     */
    public void setUserIdNum(String UserIdNum) {
        this.UserIdNum = UserIdNum;
    }

    /**
     * @return the UserAdd
     */
    public String getUserAdd() {
        return UserAdd;
    }

    /**
     * @param UserAdd the UserAdd to set
     */
    public void setUserAdd(String UserAdd) {
        this.UserAdd = UserAdd;
    }

    /**
     * @return the UserBirth
     */
    public String getUserBirth() {
        return UserBirth;
    }

    /**
     * @param UserBirth the UserBirth to set
     */
    public void setUserBirth(String UserBirth) {
        this.UserBirth = UserBirth;
    }

    /**
     * @return the UserSal
     */
    public double getUserSal() {
        return UserSal;
    }

    /**
     * @param UserSal the UserSal to set
     */
    public void setUserSal(double UserSal) {
        this.UserSal = UserSal;
    }
    
    
}
