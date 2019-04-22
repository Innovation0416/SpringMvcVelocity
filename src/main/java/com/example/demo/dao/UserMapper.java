package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	public List<User> findAll();
	
	public int delUser(int id);
	
	public List<User> loginCheck(User user);
	
	public boolean registerUser(User user);
}
