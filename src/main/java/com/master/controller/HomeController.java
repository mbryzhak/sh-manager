package com.master.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHomeForm(ModelMap model, Principal principal){
        LOGGER.debug("Requesting /home.html page");
        model.addAttribute("login", principal.getName());
        return "home";
    }
}
