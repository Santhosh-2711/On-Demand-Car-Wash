package com.ums.service;

import java.util.List;

import com.ums.model.User;

public interface UserService {
	User add(User user);
	List<User> get();
	User getOne(Long user_id);
	void delete(User user);

}
