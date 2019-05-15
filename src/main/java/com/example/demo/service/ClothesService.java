package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClothesMapper;
import com.example.demo.entity.Clothes;

@Service
public class ClothesService {
	@Autowired
	private ClothesMapper clothesMapper;

	public List<Clothes> findAll(int items, String category , short sex) {
		return clothesMapper.findAll(items, category,sex);
	}

	public List<Clothes> findByColums(String category) {
		return clothesMapper.findByColums(category);
	}
	
	public Clothes findById(String id) {
		return clothesMapper.findById(id);
	}
}
