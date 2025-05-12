package com.washermanagement.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washermanagement.model.Washer;
import com.washermanagement.repository.WasherRepo;
import com.washermanagement.service.WasherService;

@Service
public class WasherServiceImpl implements WasherService {

	private static Logger logger = LoggerFactory.getLogger(WasherServiceImpl.class);
	
	@Autowired
	private WasherRepo washerRepo;
	
	public WasherServiceImpl(WasherRepo washerRepo) {
		super();
		this.washerRepo = washerRepo;
	}
	
	
	@Override
	public Washer add(Washer washer) {
		logger.info("Request received to add Washer: {}", washer);
		try {
			Washer savedWasher = washerRepo.save(washer);
			logger.info("Washer added successfully: {}", savedWasher);
			return savedWasher;
		} catch (Exception e) {
			logger.error("Error occurred while adding Washer: {}", e.getMessage(), e);
			return null;
		}
	}

	@Override
	public List<Washer> get() {
		logger.info("Fetching all Washers");
		try {
			List<Washer> washerList = washerRepo.findAll();
			logger.info("Fetched {} Washers", washerList.size());
			return washerList;
		} catch (Exception e) {
			logger.error("Error occurred while fetching Washers: {}", e.getMessage(), e);
			return null;
		}
	}

	@Override
	public Washer getOne(Long washer_id) {
		logger.info("Fetching Washer with id: {}", washer_id);
		try {
			Washer washer = washerRepo.findById(washer_id).orElseThrow();
			logger.info("Fetched Washer: {}", washer);
			return washer;
		} catch (Exception e) {
			logger.error("Error occurred while fetching Washer with id {}: {}", washer_id, e.getMessage(), e);
			return null;
		}
	}

	@Override
	public void delete(Washer washer) {
		
		logger.info("Request received to delete Washer: {}", washer);
		try {
			washerRepo.delete(washer);
			logger.info("Washer deleted successfully: {}", washer);
		} catch (Exception e) {
			logger.error("Error occurred while deleting Washer: {}", e.getMessage(), e);
		}
	}
	

}
