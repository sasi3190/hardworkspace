package com.online.practise;

public class Overload {

	public static void main(String[] args) {
		Overload load=new Overload();
		int result = load.prod(5,5,5);
		
		System.out.println("Result is:" +result);
		

	}

	public int prod(int a,int b){
		
		return a*b;
	}
    
    public int prod(int a,int b,int c){
		System.out.println("using int+int");
  		return a*b*c;
  	}
}
