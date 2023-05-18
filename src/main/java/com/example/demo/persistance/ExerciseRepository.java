package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {

	
	@Query("from Exercise where workout_types=?1")
	public List<Exercise> searchExerciseByWorkoutTypes(String workout_types);
}
