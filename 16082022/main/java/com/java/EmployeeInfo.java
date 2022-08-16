package com.java;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeInfo {
	@RequestMapping("/hello")

	public String display(@RequestParam("empno") String empno, @RequestParam("empname") String empname,
			@RequestParam("des") String des, @RequestParam("sal") String sal,
			Model m)

	{

		String msg = "Employee Information\n "+ "Employee No: "+empno+"\nEmployee Name: "+empname+"\nDesignation: "+des+"\nSalary: "+sal;

		// add a message to the model

		m.addAttribute("message", msg);

		return "viewpage";

	}
}
