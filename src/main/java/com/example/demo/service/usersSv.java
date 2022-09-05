package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.users;
import com.example.demo.repo.usersRepo;

@Service
public class usersSv {
	@Autowired
	private usersRepo repo;
	
	public List<users> findAll(){
		return repo.findAll();
	}
	
	public void save(users users) {
		repo.save(users);
	}
	
	public users get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
