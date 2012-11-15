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
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.UUID;

@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView execute(Model model) throws InterruptedException {
        LOGGER.info("GET /login.htm");

		return new ModelAndView("login");
	}
}
