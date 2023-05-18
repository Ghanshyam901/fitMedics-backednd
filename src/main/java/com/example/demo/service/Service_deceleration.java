package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Diet;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Exercise;
import com.example.demo.entity.Lab_Test;
import com.example.demo.entity.Medicine;
import com.example.demo.entity.Registration;
import com.example.demo.entity.Trainer;

public interface Service_deceleration {
    
	///reg
	public void addUser(Registration user);
	public Registration getUser(int id);
	public List<Registration> getAllUsers();
	public void updateDetails(Registration user);
	public List<Registration> getAdmins(boolean is_admin);
	
	
//	public List<Doctor> displayAlldataDoctor();
//	public void InsertDoctor(Doctor doc);
//	public void updateDoctor(Doctor doc);
//	public Doctor  displayByIdDoctor(int id);
//	public void deleteDoctorById(int id);
//	public List<Doctor> getDoctorBySpeciality(String speciality);
	
	public List<Trainer> displayAlldataTrainer();
	public void InsertTrainer(Trainer trn);
	public void updateTrainer(Trainer trn);
	public Trainer  displayByIdTrainer(int id);
	public void deleteTrainerById(int id);
	public List<Trainer> getTrainerBySpeciality(String speciality);
	
	
	public List<Exercise> displayAlldataExercise();
	public void InsertExercise(Exercise exe);
	public void updateExercise(Exercise exe);
	public Exercise  displayByIdExercise(int id);
	public void deleteExerciseById(int id);
	
	public List<Diet> displayAlldataDiet();
	public void InsertDiet(Diet det);
	public void updateDiet(Diet det);
	public Diet  displayByIdDiet(int id);
	public void deleteDietById(int id);
	
	public List<Exercise> searchExerciseByWorkoutTypes(String workout_types);
	public List<Diet> searchDietByTypes(String diet_types);
	
	///ayush
	
	public List<Medicine> displayAllMedicines();  
	public void updationMedicine(Medicine medicine);
	public void insertionMedicine(Medicine medicine) ; 
	public List<Medicine> displayByMedicineName(String medicine_name);
	public void deletionMedicine(int id);
	
	public List<Appointment> displayAllAppointments();  
	public void updationAppointment(Appointment appointment);
	public void insertionAppointment(Appointment appointment) ; 
	public List<Appointment> displayByName(String name);
	public void deletionAppointment(int id);
	
	public List<Doctor> displayAlldataDoctor();
	public void InsertDoctor(Doctor doc);
	public void updateDoctor(Doctor doc);
	public Doctor  displayByIdDoctor(int id);
	public void deleteDoctorById(int id);
	public List<Doctor> getDoctorBySpeciality(String speciality);
	
	public List<Lab_Test> displayAlldataTest();
	public void InsertTest(Lab_Test test);
	public void updateTest(Lab_Test test);
	public void deleteTestById(int id);
	public List<Lab_Test> getTestByTestName(String test_name);
	
}
