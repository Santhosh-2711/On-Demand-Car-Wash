package com.billing.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.billing.model.Booking;


@FeignClient(name = "BMS")
public  interface BookingClient {
	@GetMapping("/booking/{id}")
	
	Booking getOrder(@PathVariable("id") Long order_id);

	Booking getSeating_capacity(Integer seating_capacity);

	
		

}
