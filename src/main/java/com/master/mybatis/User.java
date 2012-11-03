package com.master.mybatis;

import com.master.common.type.UserRole;
import com.master.mybatis.Credentials;
import com.master.mybatis.House;
import com.master.mybatis.Profile;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {

    private Integer iduser;
    private UUID userUUID;
    private String userEmail;
    private Date userDateCreated;
    private UserRole userRole;
    private String userFirstName;
    private String userLastName;
    private Boolean userSex;
    private Credentials credentials;
    private List<House> houses;

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserDateCreated() {
        return userDateCreated;
    }

    public void setUserDateCreated(Date userDateCreated) {
        this.userDateCreated = userDateCreated;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    private List<Profile> profiles;

    @Override
    public String toString(){
        final String semicolonPattern = "; ";
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("UserId: ").append(iduser).append(semicolonPattern);
        sb.append("UUID: ").append(userUUID).append(semicolonPattern);
        sb.append("Email: ").append(userEmail).append(semicolonPattern);
        sb.append("DateCreated: ").append(userDateCreated).append(semicolonPattern);
        sb.append("FirstName: ").append(userFirstName).append(semicolonPattern);
        sb.append("LastName: ").append(userLastName).append(semicolonPattern);
        sb.append("Role: ").append(userRole).append(semicolonPattern);
        sb.append("Sex: ").append(userSex).append(semicolonPattern);
        return sb.toString();
    }
}