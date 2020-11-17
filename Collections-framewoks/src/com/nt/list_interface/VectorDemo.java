package com.nt.list_interface;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		Vector v1 = new Vector(100);
		Vector v2 = new Vector(1000,5);
		System.out.println("V : "+v.capacity());
		System.out.println("V1: "+v.capacity());
		System.out.println("V2: "+v.capacity());
		for (int i = 0; i < 10; i++) {
			v.addElement("M");
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());
	}
}
