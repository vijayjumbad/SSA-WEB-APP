package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.SSAUser;
import com.ashokit.service.SSAWebUserService;

@RestController
public class SSAEnrollController {
	@Autowired
	SSAWebUserService service;

	@PostMapping("/addUser")
	public ResponseEntity<String> fetchSSAUser(@RequestBody SSAUser user) {
		//use service
		String addSsaUser = service.addSsaUser(user);
		return new ResponseEntity<String>(addSsaUser, HttpStatus.CREATED);

	}

}
