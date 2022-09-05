package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.students;
import com.example.demo.model.users;
import com.example.demo.service.studentsSv;
import com.example.demo.service.usersSv;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class homeController {
	
	@Autowired
	private studentsSv studentsSv;
	
	@Autowired
	private usersSv usersSv;
	
	@GetMapping("/students")
	public List<students> viewstudents() {
		List<students> students=studentsSv.findAll();
		return students;
	}	
	@GetMapping("/users")
	public List<users> viewusers() {
		List<users> users=usersSv.findAll();
		return users;
	}
	@PostMapping("/createstudent")
	public void createstudent(@RequestBody students student) {
		studentsSv.save(student);
	}  
	@PostMapping("/createuser")
	public void createuser(users user) {
		usersSv.save(user);
	}
	@PostMapping("/updatestudent/{id}")
	public students updatestudent(students student,@PathVariable("id") Integer id) {
		students st=studentsSv.get(id);
		return st;
	}
	@PostMapping("/updateuser/{id}")
	public users updateuser(users user,@PathVariable("id") Integer id) {
		users st=usersSv.get(id);
		return st;
	}
	@DeleteMapping("/deletestudent/{id}")
	public void deletestudent(@PathVariable("id") Integer id) {
		studentsSv.delete(id);
	}
	@DeleteMapping("/deleteuser/{id}")
	public void deleteuser(@PathVariable("id") Integer id) {
		usersSv.delete(id);
	}
	
}
