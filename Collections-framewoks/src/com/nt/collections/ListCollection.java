package com.nt.collections;

import java.util.LinkedList;

public class ListCollection {
public static void main(String[] args) {
	LinkedList ll = new LinkedList<>();
	
	
	double mobile =756634967;
	System.out.println(mobile);
	ll.add("A");
	ll.add("B");
	ll.add("C");
	ll.add(1,"D");
	System.out.println(ll);
	/*VectorCollection a = new VectorCollection();
	ll.push(a);
	System.out.println(a);*/
	
	int a=0;
	int b=10;
	if((a!=0) && (b/0==0)) {
		b++;
		a=10;
		b+=a;
		System.out.println(a);
		System.out.println(b);
	}
	
}
}
