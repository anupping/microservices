package com.bcd.feign.client;

import com.bcd.feign.client.dto.UserResponse;
import com.bcd.feign.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignCleintApplication {

	@Autowired
	private UserService userService;

	@GetMapping("/findAllUsers")
	public List<UserResponse> userResponseList() {

		return userService.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(FeignCleintApplication.class, args);
	}

}
