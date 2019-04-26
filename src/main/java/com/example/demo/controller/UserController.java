package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.entry.ViewDispather;
import com.example.demo.service.UserService;

@Controller
@RequestMapping(path = { "/ssm" })
public class UserController extends ViewDispather{

	public final static String SESSION_KEY = "loginUserInfo";
	
	@Autowired
	private UserService userService;

	@RequestMapping("/doLoginCheck")
	public ModelAndView loginCheck(HttpSession session, User loginUser) {
		if (userService.loginCheck(loginUser)) {
			session.setAttribute(SESSION_KEY, loginUser);
			return new ModelAndView("redirect:/ssm/index");
		}
		return new ModelAndView("redirect:/ssm/error");
	}
					
	@RequestMapping("/doRegister")
	public ModelAndView register(HttpSession session, User registerUser) {
		if (userService.registerUser(registerUser)) {
			session.setAttribute(SESSION_KEY, registerUser);
			return new ModelAndView("redirect:/ssm/home");
		}
		return new ModelAndView("redirect:/ssm/error");
	}
}
