package com.online.abstractclass;

public class Employee extends Person {
    
	
	   public void set (int x,int y)
	    {
	        this.x=x;
	        this.y=y;
	        System.out.println("x "+x);
	        System.out.println("y "+y);
	        
	    }
	   public void display()
	    {
	        System.out.println("Revoke");
	        
	    }
	    public static void main(String args[])
	    {
	        Employee c1= new Employee();
	        c1.set(10,20);
	        c1.display();
	        c1.show();
	    }
	}