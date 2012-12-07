package com.master.controller;

import com.master.common.type.UserRole;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/sh-manager")
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) throws InterruptedException {
        LOGGER.info("GET /login.htm");

        String dateNow = (new Date()).toString();

        model.addAttribute("dateNow", dateNow);

        return "login";
    }


    @RequestMapping(value = "/login/go", method = RequestMethod.POST)
    public String login(@RequestParam("login") String login,
                              @RequestParam("password") String password, Model model) throws InterruptedException {
        LOGGER.info(String.format("Attempting to log in with user name '%s' and password '%s'", login, password));

        String success = "false";
        if(login != null)
            success = "true";

        model.addAttribute("success", success);

        return "login";
    }
}
