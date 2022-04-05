package com.model;

import org.springframework.stereotype.Component;

@Component
public interface BookingDAO {
	public Payment makePayment(int id);
	public Booking cancelBooking(int id);
}
