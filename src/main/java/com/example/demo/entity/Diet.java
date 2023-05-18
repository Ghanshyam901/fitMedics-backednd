package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Diet")
public class Diet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	@Column(name = "diet_types")
	private String diet_types;
	@Column(name = "diet_products")
	private String diet_products;
	@Column(name = "price")
	private Double price;
	public Diet() {
	
	}
	public Diet(int id, String diet_types, String diet_products, Double price) {
		super();
		Id = id;
		this.diet_types = diet_types;
		this.diet_products = diet_products;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDiet_types() {
		return diet_types;
	}
	public void setDiet_types(String diet_types) {
		this.diet_types = diet_types;
	}
	public String getDiet_products() {
		return diet_products;
	}
	public void setDiet_products(String diet_products) {
		this.diet_products = diet_products;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Diet [Id=" + Id + ", diet_types=" + diet_types + ", diet_products=" + diet_products + ", price=" + price
				+ "]";
	}
	


}
