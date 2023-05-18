package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Exercise")
public class Exercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	@Column(name = "body_types")
	private String body_types;
	@Column(name = "workout_types")
	private String workout_types;
	@Column(name = "price")
	private Double price;
	public Exercise() {
		
	}
	public Exercise(int id, String body_types, String workout_types, Double price) {
		super();
		Id = id;
		this.body_types = body_types;
		this.workout_types = workout_types;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBody_types() {
		return body_types;
	}
	public void setBody_types(String body_types) {
		this.body_types = body_types;
	}
	public String getWorkout_types() {
		return workout_types;
	}
	public void setWorkout_types(String workout_types) {
		this.workout_types = workout_types;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Exercise [Id=" + Id + ", body_types=" + body_types + ", workout_types=" + workout_types + ", price="
				+ price + "]";
	}

}
