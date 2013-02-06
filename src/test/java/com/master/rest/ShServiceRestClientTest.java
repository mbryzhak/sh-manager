package com.master.rest;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class ShServiceRestClientTest {

    @Test
    public void testGet(){
        ShServiceRestClient restClient = new ShServiceRestClient();
        String content = restClient.get();
        System.out.println(content);
        assertNotNull(content);
    }
}
