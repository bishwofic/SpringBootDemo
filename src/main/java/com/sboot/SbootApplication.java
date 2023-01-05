package com.sboot;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sboot.dao.UserRepo;
import com.sboot.entity.User;

@SpringBootApplication
public class SbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbootApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		User user = new User();
		user.setId(0);
		user.setName("Bish");
		user.setAddress("Rupandehi");

		User user1 = new User();
		user1.setId(1);
		user1.setName("Boo");
		user1.setAddress("Butwal");
	}
	
}
