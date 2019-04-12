package com.example.demo.controller;




import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Clothes;
import com.example.demo.service.ClothesService;

@Controller
@RequestMapping(path = { "/ssm" })
public class ClothesController {
	
	public final static String SESSION_KEY = "loginUserInfo";
	
	@Autowired
	private ClothesService clothesService;
	
	@RequestMapping("/home")
	public String setCard(ModelMap model) {
		List <Clothes> clothesList = clothesService.findAll(); 
		for (Clothes clothes:clothesList) {
			model.addAttribute("card", clothes);
		}	
		return "home";
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/ssm/login");
	}
}
