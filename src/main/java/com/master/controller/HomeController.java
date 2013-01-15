package com.master.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping(value = "/home.html", method = RequestMethod.GET)
    public String viewHomeForm(ModelMap model){
        LOGGER.debug("Requesting /home.html page");
        return "home";
    }
}
