package com.master.mybatisgenerated;

import com.master.common.type.UserRole;
import java.util.Date;
import java.util.UUID;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.idUser
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private Integer iduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userUUID
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private UUID userUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userEmail
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userDateCreated
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private Date userDateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userRole
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private UserRole userRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userFirstName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private String userFirstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userLastName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private String userLastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userSex
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    private Boolean userSex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.idUser
     *
     * @return the value of users.idUser
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public Integer getIduser() {
        return iduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.idUser
     *
     * @param iduser the value for users.idUser
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userUUID
     *
     * @return the value of users.userUUID
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public UUID getUserUUID() {
        return userUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userUUID
     *
     * @param userUUID the value for users.userUUID
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userEmail
     *
     * @return the value of users.userEmail
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userEmail
     *
     * @param userEmail the value for users.userEmail
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userDateCreated
     *
     * @return the value of users.userDateCreated
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public Date getUserDateCreated() {
        return userDateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userDateCreated
     *
     * @param userDateCreated the value for users.userDateCreated
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserDateCreated(Date userDateCreated) {
        this.userDateCreated = userDateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userRole
     *
     * @return the value of users.userRole
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userRole
     *
     * @param userRole the value for users.userRole
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userFirstName
     *
     * @return the value of users.userFirstName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userFirstName
     *
     * @param userFirstName the value for users.userFirstName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName == null ? null : userFirstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userLastName
     *
     * @return the value of users.userLastName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userLastName
     *
     * @param userLastName the value for users.userLastName
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName == null ? null : userLastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userSex
     *
     * @return the value of users.userSex
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public Boolean getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userSex
     *
     * @param userSex the value for users.userSex
     *
     * @mbggenerated Sun Oct 07 02:27:36 EEST 2012
     */
    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("UserId: ").append(iduser).append("; ");
        sb.append("UUID: ").append(userUUID).append("; ");
        sb.append("Email: ").append(userEmail).append("; ");
        sb.append("DateCreated: ").append(userDateCreated).append("; ");
        sb.append("FirstName: ").append(userFirstName).append("; ");
        sb.append("LastName: ").append(userLastName).append("; ");
        sb.append("Role: ").append(userRole).append("; ");
        sb.append("Sex: ").append(userSex).append("; ");
        return sb.toString();
    }
}