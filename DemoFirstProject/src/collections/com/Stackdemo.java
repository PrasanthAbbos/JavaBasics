package collections.com;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);	
		System.out.println(s);	
		s.pop();	
		System.out.println(s);	
		System.out.println(s.peek());
		System.out.println(s);
	}

}
