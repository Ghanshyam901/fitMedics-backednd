package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Medicine") 
public class Medicine
{
@Id               
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name="id")  
private int id;
@Column(name="medicine_name")
private String medicine_name; 
@Column(name="stock_available")  
private int stock_available;
@Column (name="billing_amount")
private int billing_amount;

public Medicine() {

}

public Medicine(int id, String medicine_name, int stock_available, int billing_amount) {
	this.id = id;
	this.medicine_name = medicine_name;
	this.stock_available = stock_available;
	this.billing_amount = billing_amount;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMedicine_name() {
	return medicine_name;
}

public void setMedicine_name(String medicine_name) {
	this.medicine_name = medicine_name;
}

public int getStock_available() {
	return stock_available;
}

public void setStock_available(int stock_available) {
	this.stock_available = stock_available;
}

public int getBilling_amount() {
	return billing_amount;
}

public void setBilling_amount(int billing_amount) {
	this.billing_amount = billing_amount;
}

@Override
public String toString() {
	return "Medicine [id=" + id + ", medicine_name=" + medicine_name + ", stock_available=" + stock_available
			+ ", billing_amount=" + billing_amount + "]";
}












}	
	
