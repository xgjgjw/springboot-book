package com.mj.provider.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.provider.user.dao.UserMapper;
import com.mj.provider.user.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserByID(int id) {
		// TODO Auto-generated method stub
		return userMapper.getUserByID(id);
	}

}
