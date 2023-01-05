package com.sboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.sboot.entity.User;

	public interface UserRepo extends CrudRepository<User, Integer>{
		
	}

