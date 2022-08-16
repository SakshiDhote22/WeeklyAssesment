

package com.java.jpa.find;


import javax.persistence.*;

import com.java.jpa.employee.*;

public class FindEmployee {

  public static void main(String args[])

  {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

    EntityManager em=emf.createEntityManager();

    EmployeeEntity s=em.find(EmployeeEntity.class,101);

    System.out.println("Employee id = "+s.getEmpno());

    System.out.println("Employee Name = "+s.getEmpname());

    System.out.println("Designation = "+s.getDesignation());
    
    System.out.println("Salary = "+s.getSal());

  }

}


