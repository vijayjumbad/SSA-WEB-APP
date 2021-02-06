package com.ashokit.service;

import com.ashokit.entity.SSAUser;

public interface SSAWebUserService {
	public String addSsaUser(SSAUser user);

	public String varifySSAUser(Integer ssnNo);

}
