package com.master.support;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.fail;

public class BaseTestSupport {

    private static final Logger LOGGER = Logger.getLogger(BaseTestSupport.class);
    private static Properties propertiesBackup;

    @BeforeClass
    public static void setupEnv() {

        try{
            Properties properties = new Properties(System.getProperties());
            propertiesBackup = properties;
            FileInputStream inputStream = new FileInputStream("src/test/resources/env/testEnv.properties");
            properties.load(inputStream);
            properties.entrySet();
        } catch (FileNotFoundException e) {
            LOGGER.error(e);
            fail();
        } catch (IOException e) {
            LOGGER.error(e);
            fail();
        }

        LOGGER.info("System properties list: " + System.getProperties().toString());
    }

    @AfterClass
    public static void destroyEnv(){
        System.getProperties().clear();

        LOGGER.info("System properties list: " + System.getProperties().toString());
    }
}
