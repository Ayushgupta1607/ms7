package com.bankapp.model.persitance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	public User findByUsername(String username);
	public List<User> findByProfile(String profile);
}
