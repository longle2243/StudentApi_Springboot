package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.students;
import com.example.demo.repo.studentsRepo;

@Service
public class studentsSv {
	@Autowired
	private studentsRepo repo;
	
	public List<students> findAll(){
		return repo.findAll();
	}
	
	public void save(students students) {
		repo.save(students);
	}
	
	public students get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
