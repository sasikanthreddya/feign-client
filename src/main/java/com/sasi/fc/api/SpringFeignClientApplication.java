package com.sasi.fc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.fc.api.client.UserClient;
import com.sasi.fc.api.dto.UserResponce;


@SpringBootApplication

@EnableFeignClients
public class SpringFeignClientApplication {
	
<<<<<<< HEAD
	
	@GetMapping("/test")
	public String welcome() {
		return "welcome to feign client";
=======
	@Autowired
	private UserClient client;

	@GetMapping("/findAllUser")
	public List<UserResponce> getAllUser() {
		return client.getAllUsers();
	}

>>>>>>> 8d67a83f5efc21f3f48a6a96c58acae1bb515197
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientApplication.class, args);
	}
}
