package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Clothes;
import com.example.demo.service.OrderService;


@Controller
@RequestMapping(path = { "/ssm" })
public class OrderController {
	
	public final static String SESSION_KEY = "loginUserInfo";

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/doGetOrderInfo")
	public String getOrderInfo(HttpSession session,Model model) {
		model.addAttribute("");
		return "order";
	}
}
