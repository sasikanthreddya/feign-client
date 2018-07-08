package com.sasi.fc.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.fc.api.client.UserClient;
import com.sasi.fc.api.dto.UserResponce;

@RestController
public class UsersControllers {

	@Autowired
	private UserClient client;

	@GetMapping("/findAllUser")
	public List<UserResponce> getAllUser() {
		return client.getAllUsers();
	}

}
