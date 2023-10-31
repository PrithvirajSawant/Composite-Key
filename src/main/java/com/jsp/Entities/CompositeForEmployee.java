package com.jsp.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeForEmployee implements Serializable {
	private int id;
	private String name;
	
	public CompositeForEmployee()
	{
		
	}

	public CompositeForEmployee(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CompositeForEmployee [id=" + id + ", name=" + name + "]";
	}
	
	

}
