package spring.client;

import spring.domain.Customer;
import spring.services.CustomerService;
import spring.services.CustomerServiceImp;

public class OrderApplication {

	
	public static void main(String[] args) {
		Customer Cust = new Customer();
		CustomerService CustSer = new CustomerServiceImp();
		double salary=CustSer.dispaly(123,"luv",220);
		System.out.println(salary);
		
		
		
		
		
		
		

	}

}
