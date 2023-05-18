package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Doctor")
public class Doctor {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		@Column(name = "first_name") 
		private String first_name;
		@Column(name = "last_name")
		private String last_name;
		@Column(name = "email")
		private String email;
		@Column(name = "age")
		private int age;
		@Column(name = "speciality")
		private String speciality;
		@Column(name = "exp_years")
		private int exp_years;
		@Column(name = "fees")
		private double fees;
		public Doctor() {
			
		}
		public Doctor(int id, String first_name, String last_name, String email, int age, String speciality,
				int exp_years, double fees) {
			super();
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.age = age;
			this.speciality = speciality;
			this.exp_years = exp_years;
			this.fees = fees;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSpeciality() {
			return speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public int getExp_years() {
			return exp_years;
		}
		public void setExp_years(int exp_years) {
			this.exp_years = exp_years;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "Doctor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
					+ ", age=" + age + ", speciality=" + speciality + ", exp_years=" + exp_years + ", fees=" + fees
					+ "]";
		}
		
		

}
