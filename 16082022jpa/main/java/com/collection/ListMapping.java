
package com.java.collection;
import javax.persistence.*;

import com.java.jpa.*;

public class ListMapping {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		

		

		

		Employee e1 = new Employee();

		e1.setEmp_no(1);

		e1.setEmp_name("Vijay");
		
		e1.setDes("dev");
		
		e1.setSal(50000);

		

		Employee e2 = new Employee();

		e2.setEmp_no(2);

		e2.setEmp_name("Vijay");
		
		e2.setDes("dev");
		
		e2.setSal(50000);
		

		em.persist(e1);

		em.persist(e2);

		em.getTransaction().commit();

		em.close();

		emf.close();

	}

}
