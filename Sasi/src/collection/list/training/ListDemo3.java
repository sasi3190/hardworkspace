package collection.list.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {

	public ListDemo3() {
		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("Six");
		list1.add("Four");
		System.out.println("List1 = "+list1);
		
		Collections.sort(list1);
		System.out.println("List1 = "+list1);
		
	}
	
	public static void main(String[] args) {
		new ListDemo3();
	}

}
