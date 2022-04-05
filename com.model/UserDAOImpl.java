package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public boolean modifyUser(User user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		User user=session.get(User.class, id);
		session.delete(user);
		session.flush();
		session.getTransaction().commit();
		return true;
	}
	
	@Override
	public User findUser(int id) {
		Session session=sessionFactory.openSession();
		User user=session.get(User.class,id);
		return user;
	}

	@Override
	public Flight searchFlight(int id) {
		
		return null;
	}

	@Override
	public FlightStatus viewSchedule(int id) {
		
		return null;
	}

	@Override
	public boolean bookTicket(Booking book) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(book);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

	@Override
	public Booking purchaseTicket(int id) {
		
		return null;
	}

	@Override
	public boolean cancelTicket(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Booking booking=session.get(Booking.class, id);
		session.delete(booking);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

}
