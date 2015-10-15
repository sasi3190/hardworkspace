package com.online.Thread;

import java.util.Random;

public class Mutton implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public Mutton(String X){
		name = X;
		time = r.nextInt(999);
		}
	public void run(){
		try{
			System.out.printf("%s is sleeping nicely after having mutton %d\n",name ,time);
			Thread.sleep(time);
			System.out.printf("%s is Done sleeping \n ",name);
			
		}
		catch(Exception e){
			
		}
	}
	

}
