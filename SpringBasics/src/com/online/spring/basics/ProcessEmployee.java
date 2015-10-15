package com.online.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class ProcessEmployee {

	/*private int pno;*/
	
	//@Autowired
	private Employee emp;
	
	public ProcessEmployee() {
	}
	
	//@Autowired
	public ProcessEmployee(Employee emp) {
	//	this.pno = pno;
		this.emp = emp;
	}
	
	/*public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}*/
	
	public Employee getEmp() {
		return emp;
	}
	
	//@Required
	@Autowired
	public void setEmp(Employee emp) {
	//	System.out.println("setEmp....");
		this.emp = emp;
	}
	
	public void process(){
		System.out.println(" [Employee number is being processed...]"+emp.getEno());
		System.out.println(" [Employee name is being processed...]"+emp.getEname());
	}
	
}
