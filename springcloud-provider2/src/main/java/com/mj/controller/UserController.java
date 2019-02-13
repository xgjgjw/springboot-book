package com.mj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mj.provider.user.entity.User;
import com.mj.provider.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name){
		return name;
	}
	
	@RequestMapping("/getUserByID")
	public User getUserByID(@RequestParam int id){
		User user = userService.getUserByID(id);
		user.setName("负载均衡");
		return user;
	}
}
