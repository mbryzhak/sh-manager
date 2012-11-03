package com.master.mybatis;

import java.util.UUID;

public class Profile {

    private Integer idprofile;
    private UUID profileUUID;
    private UUID userUUID;
    private String profileName;
    private Integer electricityRate;
    private Integer waterRate;
    private Integer gasRate;
    private Integer lightsRate;
    private Integer temperatureRate;
    private Integer fireProtectionRate;
    private Integer stealProtectionRate;

    @Override
    public String toString(){
        final String semicolonPattern = "; ";
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("ProfileId: ").append(idprofile).append(semicolonPattern);
        sb.append("ProfileUUID: ").append(profileUUID).append(semicolonPattern);
        sb.append("UserUUID: ").append(userUUID).append(semicolonPattern);
        sb.append("ProfileName: ").append(profileName).append(semicolonPattern);
        sb.append("ElectricityRate: ").append(electricityRate).append(semicolonPattern);
        sb.append("WaterRate: ").append(waterRate).append(semicolonPattern);
        sb.append("GasRate: ").append(gasRate).append(semicolonPattern);
        sb.append("LightsRate: ").append(lightsRate).append(semicolonPattern);
        sb.append("TemperatureRate: ").append(temperatureRate).append(semicolonPattern);
        sb.append("FireProtectionRate: ").append(fireProtectionRate).append(semicolonPattern);
        sb.append("StealProtectionRate: ").append(stealProtectionRate).append(semicolonPattern);
        return sb.toString();
    }
}