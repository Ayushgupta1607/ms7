package com.bankapp.model.service;

import java.util.List;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bankapp.model.exceptions.BankAccountNotFoundException;
import com.bankapp.model.persitance.User;
import com.bankapp.model.persitance.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void AddUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userDao.save(user);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public List<User> getEmployees() {
		// TODO Auto-generated method stub
		return userDao.findByProfile("ROLE_MGR");
	}

	@Override
	public void upgradeEmployee(String id) {
		// TODO Auto-generated method stub
		Integer Id=Integer.parseInt(id);
		User  user=userDao.findById(Id).orElseThrow(()->new BankAccountNotFoundException("bank account not found"));
		user.setProfile("SRCLERK");
		
	}

//	private Supplier BankAccountNotFoundException(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
				
	

}
