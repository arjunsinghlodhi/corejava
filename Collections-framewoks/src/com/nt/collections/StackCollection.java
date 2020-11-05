package com.nt.collections;

import java.util.Stack;

public class StackCollection {
public static void main(String[] args) {
	Stack s = new Stack();
	//System.out.println(s.capacity());
	s.add("A");
	s.push("arjun");
	s.push(5);
	s.push(8);
		
		  System.out.println(s.pop());
		  System.out.println(s);
		  System.out.println(s.pop());
		  System.out.println(s);
		  System.out.println(s.pop()); 
		  System.out.println(s);
		//  System.out.println(s.pop());
		  System.out.println(s);
		 System.out.println(s.peek());
		 System.out.println(s.search("A"));
		 
		/*
		 * for (Object object : s) { System.out.println(object); }
		 */
}
}
