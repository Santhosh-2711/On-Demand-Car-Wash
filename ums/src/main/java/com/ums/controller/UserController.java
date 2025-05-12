package com.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ums.model.User;
import com.ums.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@PostMapping
	public User create(@RequestBody User user) {
		return userService.add(user);
	}
	
	@GetMapping
	public List<User> getAll(){
		return userService.get();
	}
	
	@GetMapping("/{id}")
	public User getAll(@PathVariable Long id){
		return userService.getOne(id);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id,@RequestBody User user) {
		User change =  userService.getOne(id);
		
		change.setUname(user.getUname());
		change.setUphno(user.getUphno());
		change.setUemail(user.getUemail());
		change.setUaddress(user.getUaddress());
		change.setUser_NIC(user.getUser_NIC());
		change.setU_age(user.getU_age());
		return userService.add(change);

	}
	
	@DeleteMapping("delete/{id}")
	public String removeUser(@PathVariable Long id) {
		User user = userService.getOne(id);
	    userService.delete(user);
	    return "User deleted Successfully";
	}

}
