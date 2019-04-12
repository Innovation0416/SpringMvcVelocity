package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Clothes;
import com.example.demo.mapper.ClothesMapper;

@Service
public class ClothesService {
	@Autowired
	private ClothesMapper clothesMapper;
	
	public List<Clothes> findAll() {
		List<Clothes> list = clothesMapper.findAll();
		return list;
	}
}
