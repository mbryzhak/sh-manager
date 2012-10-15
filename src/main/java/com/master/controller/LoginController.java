package com.master.controller;

import com.master.common.type.UserRole;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/sh-manager")
public class LoginController {

    @Autowired
    private UserMapper userMapper;

	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public ModelAndView execute(Model model) throws InterruptedException {


		return new ModelAndView("login");
	}
}
