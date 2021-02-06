package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.SSAUser;

public interface SSAWebRepo extends JpaRepository<SSAUser, Integer>{

}
