package com.online.Thread;

public class OtherWayofImpl {

	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<5;i++){
					System.out.println("Thread message" +i);
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		t1.start();
		// Calling different thread ----------------------------------------
		Thread t2 = new Thread(new Mutton("TWO"));
		t2.start();


	}

}
