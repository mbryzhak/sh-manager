package com.master.mybatisgenerated;

public class UserCredentials {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.idCredential
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    private Integer idcredential;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.credentialUUID
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    private String credentialUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.userPassword
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.Users_idUser
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.idCredential
     *
     * @return the value of usercredentials.idCredential
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public Integer getIdcredential() {
        return idcredential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.idCredential
     *
     * @param idcredential the value for usercredentials.idCredential
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setIdcredential(Integer idcredential) {
        this.idcredential = idcredential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.credentialUUID
     *
     * @return the value of usercredentials.credentialUUID
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public String getCredentialUUID() {
        return credentialUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.credentialUUID
     *
     * @param credentialUUID the value for usercredentials.credentialUUID
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setCredentialUUID(String credentialUUID) {
        this.credentialUUID = credentialUUID == null ? null : credentialUUID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.userPassword
     *
     * @return the value of usercredentials.userPassword
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.userPassword
     *
     * @param userPassword the value for usercredentials.userPassword
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.Users_idUser
     *
     * @return the value of usercredentials.Users_idUser
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.Users_idUser
     *
     * @param userId the value for usercredentials.Users_idUser
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}