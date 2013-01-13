package com.master.helper;

import static org.junit.Assert.*;

import com.master.form.LoginForm;
import org.junit.Test;

public class JsonHelperTest {

    private String dummyJson = "{\"login\":\"developer\",\"password\":\"newbie\"}";

    @Test
    public void testGetString(){
        LoginForm form = JsonHelper.get(dummyJson, LoginForm.class);
        assertEquals("developer", form.getLogin());
        assertEquals("newbie", form.getPassword());
    }
}
