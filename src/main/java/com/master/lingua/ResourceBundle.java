package com.master.lingua;

import java.util.Locale;

public class ResourceBundle
{

    Locale locale;
    java.util.ResourceBundle rb;

    public ResourceBundle(Locale locale)
    {
        this.setLocation(locale);
    }

    public void setLocation(Locale location)
    {
        this.locale = location;

        this.getLocalisationFileBundle();
    }

    private void getLocalisationFileBundle()
    {
        String resourceName = "messages_" + this.locale.toString().toUpperCase();

        this.rb = java.util.ResourceBundle.getBundle("sh-manager.lingua." + resourceName,this.locale);
    }

    public String getString(String key)
    {
        return this.rb.getString(key);
    }
}
