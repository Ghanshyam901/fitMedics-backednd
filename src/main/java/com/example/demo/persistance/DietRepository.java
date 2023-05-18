package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Diet;

public interface DietRepository extends JpaRepository<Diet, Integer> {
	
	@Query("from Diet where diet_types=?1")
	public List<Diet> searchDietByTypes(String diet_types);
}
