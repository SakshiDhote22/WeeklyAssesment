package com.java.jpa.employee;

import javax.persistence.*;

@Entity

@Table(name="employeeinfo")

public class EmployeeEntity {

  @Id

  private int empno;

  private String empname;

  private String designation;
  private double sal;

  public EmployeeEntity(int empno, String empname, String designation,double sal) {

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
