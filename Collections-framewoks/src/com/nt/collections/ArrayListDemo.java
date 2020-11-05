package com.nt.collections;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	System.out.println(al.size());
	al.add("a");
	al.add("B");
	al.add("a");
	for (Object object : al) {
		System.out.println(object);
	}
	System.out.println("---------------");
	al.add(5);
	al.add(6);
	al.add(null);
	al.add(null);
	al.add(null);
	System.out.println(al.get(0).hashCode());
	
	System.out.println(al.get(2).hashCode());
	al.remove(0);
		  System.out.println("SIZE:: "+al.size());
		  System.out.println("Element :: "+al);
		  System.out.println("3rd index object :: "+al.get(3));
		 
	System.out.println(al);
}
}
