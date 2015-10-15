package com.online.multithreading;

import java.util.Scanner;

public  class Logical {

	
	public static void main(String[] args) {
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		num = input.nextInt();
		System.out.println((num%2)==0 ? "Even number":"Odd number");
		

	}

}
