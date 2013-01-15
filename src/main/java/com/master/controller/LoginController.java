package com.master.controller;

import com.master.common.type.UserRole;
import com.master.form.LoginForm;
import com.master.helper.JsonHelper;
import com.master.helper.PasswordHelper;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserCredentials;
import com.master.mybatisgenerated.UserCredentialsMapper;
import com.master.mybatisgenerated.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCredentialsMapper userCredentialsMapper;

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String viewLoginForm(ModelMap model) {
        LOGGER.debug("Requesting /login.html page");
        model.addAttribute("dateNow", (new Date()).toString());
        return "login";
    }

    @RequestMapping(value = "/login/go.html", method = RequestMethod.POST)
    public String processLoginForm(@RequestParam("requestJson") String json, ModelMap model) {
        LOGGER.debug("Attempting to log in as:\t" + json);
        LoginForm form = JsonHelper.get(json, LoginForm.class);
        User user = userMapper.selectByEmail(form.getLogin());
        if(user == null){
            model.addAttribute("message", "Wrong user email or password");
            return "login";
        }
        UserCredentials credentials = userCredentialsMapper.selectByUuid(user.getUserUUID());
        if(credentials == null){
            model.addAttribute("message", "Wrong user email or password");
            return "login";
        }
        PasswordHelper passwordHelper = new PasswordHelper(user.getUserUUID());
        if(!credentials.getUserPassword().equals(passwordHelper.encodePassword(form.getPassword()))){
            model.addAttribute("message", "Wrong user email or password");
            return "login";
        }
        model.addAttribute("login", form.getLogin());
        model.addAttribute("password", form.getPassword());
        return "home";
    }
}
