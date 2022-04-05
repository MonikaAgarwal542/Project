package com.model;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	public void addUser(User user);
	public boolean modifyUser(User user);
	public boolean deleteUser(int id);
	public Flight searchFlight(int id);
	public FlightStatus viewSchedule(int id);
	public boolean bookTicket(Booking book);
	public Booking purchaseTicket(int id);
	public boolean cancelTicket(int id);
	public User findUser(int id);
}
