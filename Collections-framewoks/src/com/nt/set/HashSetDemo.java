package com.nt.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("A");
		s.add("B");
		s.add(null);
		s.add(10);
		System.out.println(s);
		
	}
}
