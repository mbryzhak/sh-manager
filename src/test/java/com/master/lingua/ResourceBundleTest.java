package com.master.lingua;

import org.junit.Test;

import java.util.Locale;

public class ResourceBundleTest {

    @Test
    public void testGetMessage(){
        ResourceBundle resourceBundle = new ResourceBundle(Locale.ENGLISH);
        System.out.println(resourceBundle.getString("sh.login.pageTitle"));
    }
}
