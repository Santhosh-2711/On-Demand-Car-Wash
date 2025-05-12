package com.washermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.washermanagement.model.Washer;

@Repository
public interface WasherRepo extends JpaRepository<Washer, Long> {

}
