package collection.list.training;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public EnumerationDemo() {
		Vector<String> vector = new Vector<String>();
		vector.add("Green");
		vector.add("Red");
		vector.add("Blue");
		vector.add("Green");
		vector.add("Orange");
		vector.add("Maroon");
		
		System.out.println(vector);
		
		Enumeration<String> e = vector.elements();
		
		while(e.hasMoreElements()){
			String str = e.nextElement();
			
			if(str.equals("Green"))
				str = str+" Grass";
			
			if(str.equals("Red"))
				str = str+" Bike";
			
			if(str.equals("Maroon"))
				str = str+" Car";
			
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		new EnumerationDemo();
	}
}
