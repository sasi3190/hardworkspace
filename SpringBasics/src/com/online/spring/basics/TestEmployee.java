package com.online.spring.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestEmployee {

	public static void main(String[] args) {

		/*Employee emp = new Employee();
		emp.printEmployee();*/
	
	//	BeanFactory context = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		//BeanFactory context = new FileSystemXmlApplicationContext("d:/beans.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp1 = (Employee)context.getBean("emp2");
		emp1.printEmployee();
		
		//Employee emp2 = context.getBean("emp2", Employee.class);
		
	}
	

}
