package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Booking;
import com.model.BookingDAO;
import com.model.Flight;
import com.model.FlightDAO;
import com.model.User;
import com.model.UserDAO;

@RestController
public class UserController {
	@Autowired
	UserDAO userDAO;
	@Autowired
	FlightDAO flightDAO;
	@Autowired
	BookingDAO bookingDAO;
	@PostMapping("/adduser")
	public String addUser(@RequestBody User u) {
		userDAO.save(u);
		return "user added";
	}
	@PatchMapping("/modifyuser")
	public String modifyUser(@RequestBody User u) {
		userDAO.save(u);
		return "user modified";
	}

	@DeleteMapping("/deleteuser/id")
	public String deleteUser(@PathVariable int id) {
		userDAO.deleteById(id);
		return "user deleted";
		
	}
	@GetMapping("/viewschedule")
	public Optional<Flight> searchFlight(@PathVariable int id) {
		return flightDAO.findById(id);
	}
	
	@PostMapping("/bookticket")
	public boolean bookTicket(@RequestBody Booking b) {
		bookingDAO.save(b) ;
		System.out.println("ticket booked");
		return true;
		
	}
	/*public String purchaseTicket() {
		
	}*/
	
	@DeleteMapping("/cancelticket")
	public String cancelTicket(@RequestBody Booking b) {
		bookingDAO.delete(b);
		return "ticket cancelled";
	}
	@PostMapping("/viewschedule")
	public Iterable<Flight> viewSchedule() {
		return flightDAO.findAll();
	}
	
}
