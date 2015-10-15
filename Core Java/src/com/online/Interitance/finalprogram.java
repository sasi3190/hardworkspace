package com.online.Interitance;

public class finalprogram {

	
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand = "Lexus";
		c1.make = 2015;
		c1.model="Standard";
		c1.totalDoor = 2;
		Bike b1 = new Bike();
		b1.brand = "Yamaha";
		b1.make = 2000;
		b1.model = "R1";
		b1.toatlcap = 2000;
		b1.bit = 23;
		

		System.out.println("Car details: " + c1.brand+ " " + c1.make+ " " + c1.model+ "" + c1.totalDoor);
		System.out.println("Bike details: " + b1.brand+ " " + b1.make+ " " + b1.model+ "" + b1.toatlcap+""+ b1.bit);

	}

}
