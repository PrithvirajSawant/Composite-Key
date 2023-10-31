package com.jsp.Entities;

import java.io.Serializable;
import java.util.Objects;

public class CompositKeyForStudents implements Serializable{
	private int id;
	private String name;
	
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
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositKeyForStudents other = (CompositKeyForStudents) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	//Because of HashCode() & equals() same name is not allowed (Case Sensitive)
	
	
	
	

}
