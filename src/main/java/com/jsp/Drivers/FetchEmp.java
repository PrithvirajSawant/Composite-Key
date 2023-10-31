package com.jsp.Drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.Entities.CompositeForEmployee;
import com.jsp.Entities.Employee_C;

public class FetchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		Employee_C ec =  em.find(Employee_C.class, new CompositeForEmployee(101,"Rahul") );
		System.out.println(ec);

	}

}
