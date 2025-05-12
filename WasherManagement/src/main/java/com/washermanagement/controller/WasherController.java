package com.washermanagement.controller;

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

import com.washermanagement.model.Washer;
import com.washermanagement.service.WasherService;

@RestController
@RequestMapping("/washer")

public class WasherController {
	
	@Autowired
    private WasherService washerService;
	
	@PostMapping
	public Washer create(@RequestBody Washer washer) {
		return washerService.add(washer);
	}
	
	@GetMapping
	public List<Washer> getAll(){
		return washerService.get();
	}
	
	@GetMapping("/{id}")
	public Washer getAll(@PathVariable Long id){
		return washerService.getOne(id);
	}
	
	@PutMapping("/{id}")
	public Washer updateWasher(@PathVariable Long id,@RequestBody Washer washer) {
		Washer change =  washerService.getOne(id);
		
		change.setWname(washer.getWname());
		change.setWphno(washer.getWphno());
		change.setWemail(washer.getWemail());
		change.setWaddress(washer.getWaddress());
		change.setWasher_NIC(washer.getWasher_NIC());
		change.setSalary(washer.getSalary());
		change.setW_age(washer.getW_age());
		return washerService.add(change);

	}
	
	@DeleteMapping("delete/{id}")
	public String removeWasher(@PathVariable Long id) {
		Washer washer = washerService.getOne(id);
	    washerService.delete(washer);
	    return "Washer deleted Successfully";
	}
}
