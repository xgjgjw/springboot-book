package com.mj.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mj.hystrix.UserServiceHystrix;
import com.mj.provider.user.entity.User;
/**
 * name:远程服务名，及spring.application.name配置的名称
 * 此接口中的方法和远程服务中contoller中的方法名和参数需保持一致。
 * @author Administrator
 *
 */
@FeignClient(name="springcloud-provider",fallback=UserServiceHystrix.class)
public interface UserService {
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value="name") String name);
	
	@RequestMapping(value="/getUserByID")
	public User getUserByID(@RequestParam(value="id") int id);
}
