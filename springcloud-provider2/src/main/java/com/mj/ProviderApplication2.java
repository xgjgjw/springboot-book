package com.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author Administrator
 *@EnableDiscoveryClient 服务可被发现
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication2 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication2.class, args);
	}
}
