package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> findAllUser() {
		List<User> list = userMapper.findAll();
		return list;
	}

	public int delUser(int id) {
		return userMapper.delUser(id);
	}

	public boolean loginCheck(User user) {
		return userMapper.loginCheck(user).size() > 0 ? true : false;
	}	
	
	public boolean registerUser(User user) {
		return userMapper.registerUser(user);
	}
}