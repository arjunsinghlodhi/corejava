package com.nt.list_interface;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push("A");
	for (int i = 0; i < 5; i++) {
		s.push("Arjun");
	}
	System.out.println(s);
	System.out.println(s.iterator());
	System.out.println(s.capacity());
	System.out.println(s.pop());
	System.out.println(s.peek());
	System.out.println(s.search("A"));
	for (int i = 0; i < 5; i++) {
		System.out.println(s.pop());
	}
	s.clear();
	System.out.println(s);
}
}
