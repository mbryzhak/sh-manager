package com.master.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.Random;

@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHomeForm(ModelMap model, Principal principal){
        LOGGER.debug("GET: /home");
        model.addAttribute("login", principal.getName());
        model.addAttribute("sensor1", getRandom());
        model.addAttribute("sensor2", getRandom());
        model.addAttribute("sensor3", getRandom());
        return "home";
    }

    private int getRandom(){
        return new Random().nextInt(12345);
    }
}
