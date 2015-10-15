package collection.list.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public ListDemo2() {
		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("Six");
		list1.add("Four");
		System.out.println("List1 = "+list1);
		
		/*Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			String str = it.next();
			if(str.equals("Two") || str.equals("Four"))
				str += " Wheeler";
			
			System.out.println(str);
		}*/
		
		ListIterator<String> li = list1.listIterator();

		System.out.println(li.next());
		System.out.println(li.next());
		
		System.out.println(li.next());
		System.out.println(li.next());
		
	}
	public static void main(String[] args) {
		new ListDemo2();
	}

}
