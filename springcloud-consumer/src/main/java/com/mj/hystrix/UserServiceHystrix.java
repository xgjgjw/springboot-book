package com.mj.hystrix;

import org.springframework.stereotype.Component;

import com.mj.feign.UserService;
import com.mj.provider.user.entity.User;

@Component
public class UserServiceHystrix implements UserService{

	@Override
	public String hello(String name) {
		return "hello is failed!";
	}

	@Override
	public User getUserByID(int id) {
		User user = new User();
		user.setId(111);
		user.setName("111");
		user.setSex("111");
		return user;
	}

	@Override
	public String test() {
		return "The page is not exit!";
	}

}
