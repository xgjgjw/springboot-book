package com.mj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mj.feign.UserService;
import com.mj.provider.user.entity.User;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="hello/{name}",method=RequestMethod.GET)
	@ResponseBody
	public String hello(@PathVariable("name") String name){
		return userService.hello(name);
	}
	
	@RequestMapping(value="getUserByID/{id}",method=RequestMethod.GET)
	public User hello(@PathVariable("id") int id){
		return userService.getUserByID(id);
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody
	public String hello(){
		//return userService.test();
		return "hello";
	}
}
