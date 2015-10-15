package collection.list.training;

import java.util.Stack;

public class GenericStack {

	public GenericStack() {
		Stack<String> st = new Stack<String>();
		
		st.push("venkat");
		st.push("Naveen");
		st.push("Vijay");
		
		/*st.push(12);
		st.push(23.45);*/
		
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
	}
	public static void main(String[] args) {
		new GenericStack();
	}

}
