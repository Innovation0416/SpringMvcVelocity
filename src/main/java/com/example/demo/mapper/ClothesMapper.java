package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Clothes;

@Mapper
public interface ClothesMapper {
	public List<Clothes> findAll(int items);
	
	public List<Clothes>findByCategory(String category);
}
