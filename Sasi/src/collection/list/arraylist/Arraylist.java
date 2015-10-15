package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Arraylist{
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("monkey1");
		obj.add("monkey2");
		obj.add("monkey3");
		System.out.println("ArrayList items: "+obj);
		obj.add("monkey4");
		obj.remove(1);
		
		System.out.println("ArrayList items: "+obj);
		//int size(): It gives the size of the ArrayList – Number of elements of the list.
		int numberofitems = obj.size();
		System.out.println("ArrayList items: "+obj.size());
        List<Integer> intlist = new ArrayList<Integer>();
        intlist= Arrays.asList(1, 2, 3,6,4);
        
		  System.out.println("ArrayList items: "+intlist);
		  
	}
}
