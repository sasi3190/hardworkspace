package com.online.practise;

public class Cart implements Car {
	public void carColor()
	{
		System.out.println(" Black color cars are awesome");
		
	}
	public void carMake()
	{
		System.out.println(" Ford mustang 2015 make");
	}
	public static void main(String[] args){
		Cart mess=new Cart();
		mess.carColor();
		mess.carMake();
	}
}


	
	