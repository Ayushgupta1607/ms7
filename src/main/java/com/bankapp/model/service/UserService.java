package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.persitance.User;

public interface UserService {
	public void AddUser(User user);
	public User getUserByUsername(String username);
	public List<User> getEmployees();
	public void upgradeEmployee(String id);
}
