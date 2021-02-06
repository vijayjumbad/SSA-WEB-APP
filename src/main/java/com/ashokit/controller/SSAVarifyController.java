package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.SSAWebUserService;

@RestController
public class SSAVarifyController {
	@Autowired
	private SSAWebUserService service;

	@GetMapping("/varifyUser/{ssnNo}")
	public String varifySSAUser(@PathVariable("ssnNo") Integer ssnNo) {
		String varifySSAUser = service.varifySSAUser(ssnNo);
		return varifySSAUser;

	}
}
