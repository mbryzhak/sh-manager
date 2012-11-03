package com.master.helper;

import com.master.support.BaseTestSupport;
import org.junit.Test;
import static junit.framework.TestCase.*;

import java.util.UUID;

public class PasswordHelperTest extends BaseTestSupport{

    UUID randomUuid = UUID.randomUUID();
    PasswordHelper passwordHelper = new PasswordHelper(randomUuid);
    final String simplePass = "HelloTitty";
    String encodedPass;

    @Test
    public void testEncodePassword(){
        encodedPass = passwordHelper.encodePassword(simplePass);
        assertNotNull(encodedPass);
    }

    @Test
    public void testIsEquals(){
        encodedPass = passwordHelper.encodePassword(simplePass);
        assertTrue(passwordHelper.isEquals(encodedPass, simplePass));

        encodedPass = "blablabla";
        assertFalse(passwordHelper.isEquals(encodedPass, simplePass));
    }
}
