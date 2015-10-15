package com.online.logics;
import java.util.Scanner;
public class StringReverse {

	   public static void main(String[] args){
	  /*  String str = "My name is sasi";
	    StringBuilder sb = new StringBuilder(str);
	    str = sb.reverse().toString();
	    System.out.println("ReverseString : "+str);
	  }

	}*/

/*String s = "My name is sasi";
char c[] = s.toCharArray();

for( int i = c.length -1; i>=0; i--)
    System.out.print(c[i]);*/
/*}
	   
}*/



 
    
    {
       Scanner input = new Scanner(System.in);
 
       System.out.print("Enter a String: ");
       String string = input.nextLine();
 
       System.out.println("Reverse String Result: ");
       for(int i=1; i<=string.length() ;i++)
       {  
            System.out.print(string.charAt(string.length()-i)); 
       }
       System.out.println();
    }
 
}
}
