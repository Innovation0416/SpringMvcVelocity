package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.Clothes;

@Mapper
public interface ClothesMapper {
	public List<Clothes> findAll(@Param("items")int items, @Param("category")String category);

	public List<Clothes> findByColums(String category);
}
