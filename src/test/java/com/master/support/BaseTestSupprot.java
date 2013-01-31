package com.master.support;

import com.master.common.type.UserRole;
import com.master.mybatis.model.Authorities;
import com.master.mybatis.model.Rates;
import com.master.mybatis.model.Users;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.UUID;

public class BaseTestSupprot {

    public static Users createTestUser(){
        return new Users(generateString(), "test456", "firstName", "lastName", true, new Date());
    }

    public static Authorities createTestAuthorities(String username) {
        return new Authorities(username, UserRole.MANAGER);
    }

    public static Rates createTestRates(String username){
        Rates rates = new Rates();
        rates.setUsername(username);
        rates.setDateTime(new Date());
        rates.setSensor1(new Random().nextFloat());
        rates.setSensor2(new Random().nextFloat());
        rates.setSensor3(new Random().nextFloat());
        rates.setSensor4(new Random().nextFloat());
        rates.setSensor5(new Random().nextFloat());
        return rates;
    }

    private static String generateString(){
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
