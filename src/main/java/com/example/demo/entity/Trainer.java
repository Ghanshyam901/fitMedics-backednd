package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "FirstName")
	private String FirstName;
	@Column(name = "LastName")
	private String LastName;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Age")
	private int Age;
	@Column(name = "Speciality")
	private String Speciality;
	@Column(name = "Exp_Years")
	private int Exp_Years;
	@Column(name = "Fees")
	private double Fees;
	public Trainer() {
		
	}
	public Trainer(int id, String firstName, String lastName, String email, int age, String speciality, int exp_Years,
			double fees) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Age = age;
		Speciality = speciality;
		Exp_Years = exp_Years;
		Fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	public int getExp_Years() {
		return Exp_Years;
	}
	public void setExp_Years(int exp_Years) {
		Exp_Years = exp_Years;
	}
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Age=" + Age + ", Speciality=" + Speciality + ", Exp_Years=" + Exp_Years + ", Fees=" + Fees + "]";
	}
	

}
