package com.online.practise;

public class Greats {
	

	public static void main(String[] args) {
	Const ob1=new Const(15,15);
	System.out.println(ob1.getAverage());
	System.out.println(Const.Str);
	Greats.tStaticMethod();
	ob1.setNum(800,200);
	System.out.println(ob1.getAverage());
	}
	 public static void tStaticMethod(){
	        System.out.println("Hey... I am in static method...");
	     System.out.println(Const.Str);
	       
	    }
	
}
