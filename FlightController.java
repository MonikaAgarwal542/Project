package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Flight;
import com.model.FlightDAO;

@RestController
public class FlightController {
	@Autowired
	FlightDAO flightDAO;
	@PostMapping("/addflight")
	public String addFlight(@RequestBody Flight f) {
		flightDAO.save(f);
		return "flight added";
	}
	@DeleteMapping("/deleteflight")
	public String deleteFlight(@RequestBody Flight f) {
		flightDAO.delete(f);
		return "flight cancelled.";
	}
	@PatchMapping("/modifyflight")
	public String modifyFlight(@RequestBody Flight f) {
		flightDAO.save(f);
		return "flight modified";
	}

}
