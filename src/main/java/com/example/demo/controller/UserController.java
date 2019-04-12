package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.action.ViewDispather;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping(path = { "/ssm" })
public class UserController extends ViewDispather{

	public final static String SESSION_KEY = "loginUserInfo";
	
	@Autowired
	private UserService userService;

	@RequestMapping("/loginCheck")
	public ModelAndView loginCheck(HttpSession session, int id, String password) {
		User loginUser = new User();
		loginUser.setId(id);
		loginUser.setPassword(password);
		if (userService.loginCheck(loginUser)) {
			session.setAttribute(SESSION_KEY, loginUser);
			return new ModelAndView("redirect:/ssm/home");
		}
		return new ModelAndView("redirect:/ssm/error");
	}
	
}
