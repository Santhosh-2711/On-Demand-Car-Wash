package com.washermanagement.service;

import java.util.List;

import com.washermanagement.model.Washer;


public interface WasherService {
	
	Washer add(Washer washer);
	List<Washer> get();
	Washer getOne(Long washer_id);
	void delete(Washer washer);
	
	

}
