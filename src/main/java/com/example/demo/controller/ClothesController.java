package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Clothes;
import com.example.demo.service.ClothesService;

@Controller
@RequestMapping(path = { "/ssm" })
public class ClothesController {

	public final static String SESSION_KEY = "loginUserInfo";
	List<Clothes> orderItems = new ArrayList<>();

	@Autowired
	private ClothesService clothesService;


	@RequestMapping("/dologout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/ssm/login");
	}

	@RequestMapping("/doScroll")
	@ResponseBody	
	public List<Clothes> getMoreItem(int items, String category , int sex) {
		return clothesService.findAll(items, category,(short)sex);
	}
	
	@RequestMapping("/doRequestItemDetalis")
	@ResponseBody
	public void setItemDetails(HttpSession session, String id) {
		session.removeAttribute("itemDetails");
		session.setAttribute("itemDetails", clothesService.findById(id)); 
	}
	
	@RequestMapping("/doGetItemDetails")
	public String getItemDetails(HttpSession session,Model model) {
		model.addAttribute((Clothes) session.getAttribute("itemDetails"));
		return "itemDetails";
	}
	
	@RequestMapping("/doSendItemToOrder")
	@ResponseBody
	public List<Clothes> setOrderItems(HttpSession session,Clothes clothes) {
		orderItems.add((Clothes) session.getAttribute("itemDetails"));
		return orderItems;
	}
}
