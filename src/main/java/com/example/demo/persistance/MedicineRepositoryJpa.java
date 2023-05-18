package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Medicine;

public interface MedicineRepositoryJpa extends JpaRepository<Medicine,Integer> {
	
	@Query("from Medicine where medicine_name=?1")
    public List<Medicine> displayByMedicineName(String medicine_name);
	
	

}
