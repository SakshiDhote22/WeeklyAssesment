
package com.java.jpa;

import java.util.*;

import javax.persistence.*;

@Entity

public class Employee {

  @Id

  //@GeneratedValue(strategy=GenerationType.AUTO)

  private int empno;

  private String empname;

  private String designation;
  private double sal;

  @ElementCollection

 

 public int getEmp_no() {

 return empno;

 }

 public void setEmp_no(int empno) {

 this.empno = empno;

 }

 public String getEmp_name() {

 return empname;

 }

 public void setEmp_name(String empname) {

 this.empname = empname;

 }

 
 
 public String getDes() {

 return designation;

 }

 public void setDes(String designation) {

 this.designation = designation;

 }

 
 
 public double getSal() {

 return sal;

 }

 public void setSal(double sal) {

 this.sal = sal;

 }

 

 }








