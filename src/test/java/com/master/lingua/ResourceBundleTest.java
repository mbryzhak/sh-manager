package com.master.lingua;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Locale;

public class ResourceBundleTest {

    @Test
    public void testGetMessage(){
        //System.out.println(System.getProperty("lingua.location"));

        ResourceBundle resourceBundle = new ResourceBundle(Locale.ENGLISH);

        System.out.println(Locale.ENGLISH);
        System.out.println(resourceBundle.getString("sh.login.pageTitle"));
        System.out.println(resourceBundle.getString("sh.login.userName"));
        System.out.println(resourceBundle.getString("sh.login.password"));

        resourceBundle = new ResourceBundle(Locale.GERMAN);

        System.out.println(Locale.GERMAN);
        System.out.println(resourceBundle.getString("sh.login.pageTitle"));
        System.out.println(resourceBundle.getString("sh.login.userName"));
        System.out.println(resourceBundle.getString("sh.login.password"));

        /*java.util.ResourceBundle bundle;

        Locale locale = new Locale("en","US");

        bundle = java.util.ResourceBundle.getBundle("sh-manager.lingua.messages_EN",Locale.ENGLISH);

        System.out.println(bundle.getString("sh.login.pageTitle"));*/
    }

    @BeforeClass
    public static void setLingua()
    {
        System.setProperty("lingua.location","src/main/webapp/resources/lingua/messages_en.properties");
    }
}
