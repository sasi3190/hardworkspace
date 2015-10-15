package com.online.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Employee emp = context.getBean("emp1", Employee.class);
		emp.printEmployee();*/
		
		ProcessEmployee pe = context.getBean("pr", ProcessEmployee.class);
		pe.process();
		
	}

}
