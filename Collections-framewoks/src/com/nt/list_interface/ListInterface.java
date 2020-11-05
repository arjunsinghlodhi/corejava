package com.nt.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Arjun");
		l1.add("abhi");
		l1.add("pooja");
		l1.add("tanu");
		l1.add("aarti");
		l1.add("devika");
		l1.add("Arjun");
		l1.add(7,"Mukesh gandu");
		System.out.println("chacked is empty or not: "+l1.isEmpty());
		System.out.println("Size of : "+l1.size());
		System.out.println("Searching " +l1.contains("Arjun"));
		System.out.println("iteratior : "+l1.iterator());
		System.out.println("Index of "+l1.indexOf("Arjun"));
		System.out.println("Last index Of :" + l1.lastIndexOf("Arjun"));
		System.out.println("Replace with :"+l1.set(6,"aaa"));
		
		  System.out.println(l1); for (String aa : l1) { System.out.println(aa); }
		 l1.clear();
		 System.out.println("Clear data"+l1);
	}
}
