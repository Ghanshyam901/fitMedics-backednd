package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Lab_Test") 
public class Lab_Test
{
@Id               
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name="id")  
private int id;
@Column(name="test_name")
private String test_name; 
@Column(name="test_type")  
private String test_type;
@Column (name="test_amount")
private int test_amount;

public Lab_Test() {

}

public Lab_Test(int id, String test_name, String test_type, int test_amount) {
	this.id = id;
	this.test_name = test_name;
	this.test_type = test_type;
	this.test_amount = test_amount;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTest_name() {
	return test_name;
}

public void setTest_name(String test_name) {
	this.test_name = test_name;
}

public String getTest_type() {
	return test_type;
}

public void setTest_type(String test_type) {
	this.test_type = test_type;
}

public int getTest_amount() {
	return test_amount;
}

public void setTest_amount(int test_amount) {
	this.test_amount = test_amount;
}

@Override
public String toString() {
	return "Lab_Test [id=" + id + ", test_name=" + test_name + ", test_type=" + test_type + ", test_amount="
			+ test_amount + "]";
}

}

