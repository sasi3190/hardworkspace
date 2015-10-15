package collection.list.training;

import java.util.Date;
import java.util.Stack;

public class StackDemo {

	public StackDemo() {
		Stack st = new Stack();
		
		st.push(10);	// Autoboxing - java1.5
		st.push(23.45);
		
		st.push(new Integer(23));  // before java1.5
		st.push(new Double(34.56));
		
		st.push("Venkat");
		st.push(new Date());
		
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
	}
	public static void main(String[] args) {
		new StackDemo();
	}

}
