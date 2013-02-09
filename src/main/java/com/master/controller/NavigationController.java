package com.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {

    private static final String TITLE_ABOUT = "About";
    private static final String TITLE_CONTACTS = "Contacts";

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about(ModelMap model){
        model.addAttribute("title", TITLE_ABOUT);
        return "about";
    }

    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public String contacts(ModelMap model){
        model.addAttribute("title", TITLE_CONTACTS);
        return "contacts";
    }
}
