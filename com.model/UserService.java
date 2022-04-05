package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAO userDAOImpl;
	public void addUser(User user) {
		userDAOImpl.addUser(user);
	}
	public boolean updateUser(User user) {
		return userDAOImpl.modifyUser(user);
	}
	public boolean deleteUser(int id) {
		return userDAOImpl.deleteUser(id);
	}
	public User findUser(int id) {
		return userDAOImpl.findUser(id);
	}
	public boolean bookTicket(Booking book) {
		return userDAOImpl.bookTicket(book);
	}
	public boolean cancelTicket(int id) {
		return userDAOImpl.cancelTicket(id);
	}
}
