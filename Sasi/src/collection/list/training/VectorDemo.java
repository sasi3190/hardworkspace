package collection.list.training;

import java.util.Vector;

public class VectorDemo {

	public VectorDemo() {
		Vector<String> vector = new Vector<String>();
		vector.add("one");
		vector.add("Two");
		vector.add("three");
		
		vector.insertElementAt("Four", 1);
		vector.add("Five");
		
		vector.insertElementAt("Six", 3);
		System.out.println(vector);
		
	//	vector.remove(2);
		vector.remove("one");
		System.out.println(vector);
		
		System.out.println(vector.contains("Two"));
		System.out.println(vector.elementAt(3));
	//	vector.clear();
	//	System.out.println(vector);
		
		System.out.println(vector.capacity());
		System.out.println(vector.size());
	}
	public static void main(String[] args) {
		new VectorDemo();
	}

}
