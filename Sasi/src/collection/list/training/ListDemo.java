package collection.list.training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public ListDemo() {
		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("Six");
		list1.add("Four");
		System.out.println("List1 = "+list1);
		
		/*System.out.println(list1.contains("Six"));
		System.out.println(list1.indexOf("Four"));
		System.out.println(list1.lastIndexOf("Four"));
		
		System.out.println(list1.remove(2));
		System.out.println(list1.remove("Six"));
		System.out.println(list1);
		System.out.println(list1.size());*/
		
		List<String> list2 = new LinkedList<String>();
		list2.add("Orange");
		list2.add("Apple");
		list2.add("Cherry");
		System.out.println("List2 = "+list2);
		
		list1.addAll(list2);
		System.out.println("List1 = "+list1);
		
	}
	public static void main(String[] args) {
		new ListDemo();
	}

}
