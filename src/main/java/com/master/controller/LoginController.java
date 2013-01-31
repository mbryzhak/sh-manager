package com.master.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.*;

@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(@RequestParam String fail, ModelMap model, Principal principal) {
        LOGGER.debug("GET: /login?fail=" + fail);
        if(principal != null){
            return "redirect:home";
        }
        if(fail.equals("true")){
            model.addAttribute("message", "Wrong user email or password");
            return "login";
        }
        model.addAttribute("dateNow", (new Date()).toString());
        return "login";
    }
}
