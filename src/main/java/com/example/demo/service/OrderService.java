package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClothesMapper;
import com.example.demo.dao.OrderMapper;

@Service
public class OrderService {
	@Autowired
	private OrderMapper orderMapper;
}
