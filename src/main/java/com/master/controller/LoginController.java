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


    private com.master.mybatisgenerated.User createTestUser(){
        UUID USER_UUID = UUID.randomUUID();
        String USER_EMAIL = USER_UUID.toString().substring(0, 8);
        Date USER_DATE_CREATED = new Date();
        UserRole USER_ROLE = UserRole.MANAGER;
        String USER_FIRST_NAME = "Vasia";
        String USER_LAST_NAME = "Pupkin";
        boolean USER_SEX = true;

        com.master.mybatisgenerated.User user = new com.master.mybatisgenerated.User();
        user.setUserUUID(USER_UUID);
        user.setUserEmail(USER_EMAIL);
        user.setUserDateCreated(USER_DATE_CREATED);
        user.setUserRole(USER_ROLE);
        user.setUserFirstName(USER_FIRST_NAME);
        user.setUserLastName(USER_LAST_NAME);
        user.setUserSex(USER_SEX);
        return user;
    }

	@RequestMapping(value = "login.htm", method = RequestMethod.GET)
	public ModelAndView execute(Model model) throws InterruptedException {
//        User user = createTestUser();
//        userMapper.insert(user);
//        Thread.sleep(500);
//
//        model.addAttribute("user", userMapper.selectByUserUuid(user.getUserUUID()));
		return new ModelAndView("login");
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
