package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
	@Autowired
	BookingDAO bookingDAOImpl;
	public Payment makePayment(int id) {
		return bookingDAOImpl.makePayment(id);
	}
	public Booking cancelBooking(int id) {
		return bookingDAOImpl.cancelBooking(id);
	}
}
