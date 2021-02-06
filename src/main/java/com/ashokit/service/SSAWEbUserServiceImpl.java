package com.ashokit.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.SSAUser;
import com.ashokit.repository.SSAWebRepo;

@Service
public class SSAWEbUserServiceImpl implements SSAWebUserService {
	@Autowired
	SSAWebRepo ssaRepo;

	@Override
	public String addSsaUser(SSAUser user) {
		//use repo
		user.setSsnNo(new Random().nextInt(12000000));
		//save obj
		SSAUser saveUser = ssaRepo.save(user);

		if (saveUser != null)
			return "SSA user adding successful and having SSN no is::" + user.getSsnNo();
		else
			return null;
	}

	@Override
	public String varifySSAUser(Integer ssnNo) {

		SSAUser user = ssaRepo.findById(ssnNo).get();

		if (user != null && user.getState().equalsIgnoreCase("RI"))
			return "Record found with user details:" + user;
		else
			return "invalid ssn Number";
	}

}
