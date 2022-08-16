
package com.java;

import javax.persistence.*;

@Entity

@Table(name = "employeeinfo")

class EmployeeEntity {

	@Id

	private int empno;

	private String empname;

	private String designation;
	private double sal;

	public EmployeeEntity(int empno, String empname, String designation, double sal) {

		super();

		this.empno = empno;

		this.empname = empname;

		this.designation = designation;
		this.sal = sal;
	}

	public EmployeeEntity() {

		super();

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

public class FindEmployee {

	public static void main(String args[])

	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_details");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		EmployeeEntity e1 = new EmployeeEntity();

		e1.setEmpno(101);
		

		e1.setEmpname("Vijay");

		e1.setDesignation("dev");

		e1.setSal(50000);

		EmployeeEntity e2 = new EmployeeEntity();

		e2.setEmpno(102);

		e2.setEmpname("Vijay");

		e2.setDesignation("dev");

		e2.setSal(50000);

		em.persist(e1);

		em.persist(e2);

		em.getTransaction().commit();

		EmployeeEntity s = em.find(EmployeeEntity.class, 101);

		System.out.println("Employee id = " + s.getEmpno());

		System.out.println("Employee Name = " + s.getEmpname());

		System.out.println("Designation = " + s.getDesignation());

		System.out.println("Salary = " + s.getSal());

	}

}
