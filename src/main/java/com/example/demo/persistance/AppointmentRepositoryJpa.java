package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Appointment;

public interface AppointmentRepositoryJpa extends JpaRepository<Appointment,Integer> {
	
	@Query("from Appointment where name=?1")
    public List<Appointment> displayByName(String name);
	
	

}
