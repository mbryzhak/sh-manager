package com.master.controller;

import com.master.mybatisgenerated.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;
/*
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		String name = user.getUsername();

		model.addAttribute("username", name);
		model.addAttribute("message",
				"Spring Security login + database example");
		return "hello";

	}*/

	@RequestMapping(value = "index.htm", method = RequestMethod.GET)
	public ModelAndView execute(Model model) {
//        model.addAttribute("user", userMapper.selectByUserUuid(UUID.fromString("810810c4-c4c6-4ff8-9b2b-4d9b84e886f0")));
		return new ModelAndView("hello");
	}
/*
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "login";
	}*/
}
