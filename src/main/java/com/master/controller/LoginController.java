package com.master.controller;

import com.master.mybatis.mapper.ShMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @Autowired
    private ShMapper shMapper;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView execute(Model model) throws InterruptedException {

		return new ModelAndView("login");
	}
}
