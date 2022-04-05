package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Flight;
import com.model.Location;
import com.model.LocationDAO;

@RestController
public class LocationController {
	@Autowired
	LocationDAO locationDAO;
	@PostMapping("/addlocation")
	public String addLocation(@RequestBody Location l) {
		locationDAO.save(l);
		return "location added";
	}
	@DeleteMapping("/deletelocation")
	public String deleteLocation(@RequestBody Location l) {
		locationDAO.delete(l);
		return "Location cancelled.";
	}
	@PatchMapping("/modifylocation")
	public String modifyLocation(@RequestBody Location l) {
		locationDAO.save(l);
		return "location modified";
	}


}