package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Lab_Test;

public interface LabTestRepositoryJpa extends JpaRepository<Lab_Test, Integer> {
	
	 @Query("from Lab_Test where test_name=?1")
	    public List<Lab_Test> getTestByTestName(String test_name);
}
