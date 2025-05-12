package com.ums.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.model.User;
import com.ums.repository.UserRepo;
import com.ums.service.UserService;





@Service
public class UserServiceImpl implements UserService {

private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	@Override
	public User add(User user) {
		logger.info("User Registered Successfully {}", user);
		try {
			User savedUser = userRepo.save(user);
			logger.info("User Registered Successfully : {}", savedUser);
			return savedUser;
		} catch (Exception e) {
			logger.error("Error occurred while registering User: {}", e.getMessage(), e);
			return null;
		}
	}
	

	@Override
	public List<User> get() {
		logger.info("Fetching all Users");
		try {
			List<User> userList = userRepo.findAll();
			logger.info("Fetched {} Users", userList.size());
			return userList;
		} catch (Exception e) {
			logger.error("Error occurred while fetching Users: {}", e.getMessage(), e);
			return null;
		}
	}

	@Override
	public User getOne(Long user_id) {
		logger.info("Fetching User with id: {}", user_id);
		try {
			User user = userRepo.findById(user_id).orElseThrow();
			logger.info("Fetched User: {}", user);
			return user;
		} catch (Exception e) {
			logger.error("Error occurred while fetching User with id {}: {}", user_id, e.getMessage(), e);
			return null;
		}
	}

	@Override
	public void delete(User user) {
		
		logger.info("Request received to delete User: {}", user);
		try {
			userRepo.delete(user);
			logger.info("User deleted successfully: {}", user);
		} catch (Exception e) {
			logger.error("Error occurred while deleting User: {}", e.getMessage(), e);
		}
	}


	

}
