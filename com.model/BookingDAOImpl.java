package com.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingDAOImpl implements BookingDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Payment makePayment(int id) {
		
		return null;
	}

	@Override
	public Booking cancelBooking(int id) {
	
		return null;
	}

}
