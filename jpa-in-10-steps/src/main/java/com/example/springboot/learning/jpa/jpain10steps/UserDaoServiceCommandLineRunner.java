package com.example.springboot.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.learning.jpa.jpain10steps.entity.User;
import com.example.springboot.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... arg0) throws Exception {
		User user1 = new User("Eeranna","Software");
		User user2 = new User("Tejas","Engineer");
		long insert1 = userDaoService.insert(user1);
		long insert2 = userDaoService.insert(user2);
		logger.info("New user is created: " + user1);
		logger.info("New user is created: " + user2);
	}

}
