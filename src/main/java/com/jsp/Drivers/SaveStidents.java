package com.jsp.Drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Students_C;

public class SaveStidents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students_C sc = new Students_C();
		sc.setId(101);
		sc.setName("rayan");
		sc.setLoc("Bangalore");
		sc.setMarks(70);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(sc);
		et.commit();

	}

}
