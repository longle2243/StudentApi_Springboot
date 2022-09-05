package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.students;

public interface studentsRepo extends JpaRepository<students, Integer>{

}
