package com.master.mybatis;

import java.util.UUID;

/**
 * Contains user credentials for authentication to site.<br>
 * about:<br>
 *     credentialUUID same as userUUID<br>
 *     userPassword encrypted with SHA-256<br>
 */
public class Credentials {

    private Integer idcredential;
    private UUID credentialUUID;
    private String userPassword;

    public Integer getIdcredential() {
        return idcredential;
    }

    public void setIdcredential(Integer idcredential) {
        this.idcredential = idcredential;
    }

    public UUID getCredentialUUID() {
        return credentialUUID;
    }

    public void setCredentialUUID(UUID credentialUUID) {
        this.credentialUUID = credentialUUID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}