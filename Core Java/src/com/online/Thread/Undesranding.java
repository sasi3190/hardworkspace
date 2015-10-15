package com.online.Thread;


class runner extends Thread{
	public void run(){
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
}
public class Undesranding {
	public static void main(String[] args){
		runner ran = new runner();
		ran.start();
		 
		runner ran1 = new runner();
		ran1.start();
	}

}