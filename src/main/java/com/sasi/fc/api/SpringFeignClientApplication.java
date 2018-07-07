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
@RestController
@EnableFeignClients
public class SpringFeignClientApplication {
	
	@Autowired
	private UserClient client;

	@GetMapping("/findAllUser")
	public List<UserResponce> getAllUser() {
		return client.getAllUsers();
	}

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientApplication.class, args);
	}
}
