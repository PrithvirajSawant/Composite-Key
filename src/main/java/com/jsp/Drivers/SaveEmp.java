package com.jsp.Drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.CompositeForEmployee;
import com.jsp.Entities.Employee_C;
import com.jsp.Entities.Employee_Cp;

public class SaveEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeForEmployee cm = new CompositeForEmployee(101,"Rahul");
//		Employee_C e = new Employee_C(cm,"Bangalore",50000);
		Employee_Cp ecp = new Employee_Cp(22, "Raj");
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(ecp);
		et.commit();

	}

}
