package com.master.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.MediaType;

public class ShServiceRestClient {

    private static final Logger LOGGER = Logger.getLogger(ShServiceRestClient.class);

    public String get(){
        WebResource resource = new Client().resource("http://www.google.com/");
        ClientResponse response = resource.accept(MediaType.TEXT_HTML_TYPE).get(ClientResponse.class);
        if(response.getStatus() != 200){
            throw new RuntimeException("HTTP error code" + response.getStatus());
        }
        String body = response.getEntity(String.class);
        LOGGER.debug(body);
        return body;
    }

}