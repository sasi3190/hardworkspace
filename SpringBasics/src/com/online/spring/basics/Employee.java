package com.online.spring.basics;

public class Employee {

	int eno;
	String ename;

	public Employee() {
	}	
	public Employee(int eno, String ename){
	//System.out.println("constructor is running...");
		this.eno = eno;
		this.ename = ename;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
	//	System.out.println("setEno is called...");
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
	//System.out.println("setEname is called...");
		this.ename = ename;
	}

	public void printEmployee(){
		
		System.out.println("Eno = "+getEno()+" and Ename = "+getEname());
	}
	
}
