package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
	@Query("from Trainer where speciality=?1")
	public List<Trainer> searchTrainerBySpeciality(String speciality);
	
}
