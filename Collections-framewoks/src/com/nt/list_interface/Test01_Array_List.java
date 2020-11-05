package com.nt.list_interface;

import java.util.ArrayList;

public class Test01_Array_List {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//create ArrayListcollecton object
		ArrayList li = new ArrayList();
		//Add element Data
		li.add(1000);
		li.add('a');
		li.add("Arjun");
		li.add(20);
		li.add("Nataraz");
		li.add("Harikrishna");
		li.add(2000);
		li.add("murali");
		li.add("Mukesh");
		li.add(5.7);
		li.add("abhinash");
		li.add("Amit yadav");
		System.out.println(li);
		System.out.println();
		for (Object object : li) {
			System.out.println(object);
		}//foreach
		System.out.println();
		li.remove(5);
		for (Object object : li) {
			System.out.println(object);
		}//foreach
	}//main
}//class
