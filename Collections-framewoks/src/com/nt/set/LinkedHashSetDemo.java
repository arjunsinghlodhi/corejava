package com.nt.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add(10);
		lhs.add(null);
		System.out.println(lhs);
		
	}
}
