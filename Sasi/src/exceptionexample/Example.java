package exceptionexample;


import java.io.*;
public class Example {  
   public static void main(String args[])
   {
	   try {
		int num1=10;
			int num2=0;
			/*Since I'm dividing an integer with 0
			 * it should throw ArithmeticException*/
			int res=num1/num2;
			System.out.println(res);
	} catch (Exception e) {
		System.out.println("Will give you Arithmetic exception: So Give proper interger value");

	}
	FileInputStream fis = null;
	try{
	    fis = new FileInputStream("B:/myfile.txt"); 
	}catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
			"present at the given path");
	 }
	int k; 
	try{
	    while(( k = fis.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    fis.close(); 
	}catch(IOException ioe){
	    System.out.println("I/O error occurred: "+ioe);
	    
	 }
    
   }
  
}