package com.online.multithreading;
//-------------Create thread by Extending thread class---------------
/*public class TestThread {

	
	public static void main(String[] args) {
		  ThreadDemo T1 = new ThreadDemo( "Thread-1");
	      T1.start();
	      
	      ThreadDemo T2 = new ThreadDemo( "Thread-2");
	      T2.start();

	}

}
 * */



//--------------------------Creating thread by implementing runnable interface--------------------
public class TestThread {
	   public static void main(String args[]) {
		      ThreadDemo T1 = new ThreadDemo( "Thread-1");
		      T1.start();
		      
		      ThreadDemo T2 = new ThreadDemo( "Thread-2");
		      T2.start();
	   
	      RunnableDemo R1 = new RunnableDemo( "Thread-3");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "Thread-4");
	      R2.start();
	   }   
	}