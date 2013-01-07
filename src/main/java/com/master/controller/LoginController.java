package com.master.controller;

import com.master.common.type.UserRole;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String viewLogin(ModelMap model) {
        LOGGER.debug("Requesting /login.html page");
        model.addAttribute("dateNow", (new Date()).toString());
        return "login";
    }

    @RequestMapping(value = "/login/go.html", method = RequestMethod.POST)
    public String doLogin(@RequestParam("requestJSON") String requestJSON, ModelMap model) {
        LOGGER.debug("Attempting to log in\n\t" + requestJSON);

        return "home";
    }
}
