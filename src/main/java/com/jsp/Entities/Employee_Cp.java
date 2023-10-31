package com.jsp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee_Cp {
	@Id
	@GenericGenerator(name="abc", strategy = "com.jsp.Drivers.CustomId")
	@GeneratedValue(generator ="abc")
	private int id;
	private int age;
	private String name;
	
	
	public Employee_Cp( int age, String name) {
//		super();
//		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
