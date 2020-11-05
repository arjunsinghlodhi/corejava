package com.nt.collections;

import java.util.Vector;

public class VectorCollection {
public static void main(String[] args) {
	Vector v = new Vector();
	System.out.println(v.capacity());
	v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");v.add("arjun");
	System.out.println(v.capacity()+"  "+v.size());
	
	for (Object object : v) {
		System.out.println(object);
	}
	System.out.println(v);
}
}
