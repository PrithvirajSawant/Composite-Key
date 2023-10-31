package com.jsp.Entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee_C {
	@EmbeddedId
	private CompositeForEmployee cfe;
	private String loc;
	private int sal;
	
	public Employee_C()
	{
		
	}
	
	public Employee_C(CompositeForEmployee cfe, String loc, int sal) {
//		super();
		this.cfe = cfe;
		this.loc = loc;
		this.sal = sal;
	}

	public CompositeForEmployee getCfe() {
		return cfe;
	}
	public void setCfe(CompositeForEmployee cfe) {
		this.cfe = cfe;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee_C [cfe=" + cfe + ", loc=" + loc + ", sal=" + sal + "]";
	}
	
	

}
