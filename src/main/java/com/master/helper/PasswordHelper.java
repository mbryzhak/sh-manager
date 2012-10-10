package com.master.helper;

import org.apache.log4j.Logger;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Used to encode password in SHA-256. Had functionality for compare
 * if encoded passwords are equals
 *
 * @author mbryzhak
 */
public class PasswordHelper {

    private static final Logger LOGGER = Logger.getLogger(PasswordHelper.class);

    MessageDigest md;
    BASE64Encoder encoder;
    UUID userUuid;

    public PasswordHelper(UUID userUuid){
        this.userUuid = userUuid;
        init();
    }

    private void init(){
        try {
            this.encoder = new BASE64Encoder();
            this.md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private String encode(String toEncode){
        md.update(toEncode.getBytes());
        return encoder.encode(md.digest());
    }

    private String hashPassword(String pass, UUID userUuid){
        return encode(encode(pass) + userUuid.toString());
    }

    public String encodePassword(String password) throws IllegalArgumentException{
        if(password == null || password == ""){
            throw new IllegalArgumentException(password);
        } else{
            return hashPassword(password, userUuid);
        }
    }

    public boolean isEquals(String expected, String actual){
        if (expected == null || expected == ""){
            throw new IllegalArgumentException(expected);
        } else if (actual == null || actual == ""){
            throw new IllegalArgumentException(actual);
        } else {
            return expected.equals(hashPassword(actual, userUuid)) ? true : false;
        }
    }
}