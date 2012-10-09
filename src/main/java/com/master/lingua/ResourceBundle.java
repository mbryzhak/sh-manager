package com.master.lingua;

import java.util.Locale;

public class ResourceBundle {

    Locale locale;
    java.util.ResourceBundle rb;

    public ResourceBundle(Locale locale){
        this.locale = locale;
        getMessages();
    }

    private void getMessages(){
        String resourceName = "messages_" + locale.toString().toUpperCase() + ".properties";
        rb = java.util.ResourceBundle.getBundle("classpath:sh-manager/lingua/" + resourceName);
    }

    public String getString(String key){
        return rb.getString(key);
    }
}
