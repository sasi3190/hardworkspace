package com.online.Thread;

public class UsingSyncronized {

	private int count=0;
	
	
	public static void main(String[] args) {
		UsingSyncronized usyn = new UsingSyncronized();
		usyn.startworking();

	}
public  void startworking(){
	Thread t1= new Thread(new Runnable(){
		public void run(){
			for(int i=0;i<5;i++){
				System.out.println("Hello this belongs to thread1 "+i);
				increase();
			}
		}
	});
	Thread t2= new Thread(new Runnable(){
		public void run(){
			for(int i=0;i<5;i++){
				System.out.println("Hello this belongs to thread2  "+i);
				increase();
			}
		}
	});
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("counted number is "+count);
	
}
public synchronized void increase(){
	 count ++;
	 
}
}
