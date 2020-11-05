package com.nt.list_interface;

import java.util.Hashtable;

public class Test_HaseTAble {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("hari","CoreJava");
		ht.put("Nataraz","AdvJava");
		ht.put("Murali","Oracle");
		ht.put("Sudhakar","C/C++");
		ht.put("HariKrishnaSagar","Apptitute");
		ht.put("vijay kumar","Oracle");
		System.out.println(ht);
		System.out.println(ht.getClass());
		System.out.println(ht.get("hari"));
		System.out.println(ht.get("Nataraz"));
		System.out.println(ht.get("Murali"));
	}
}
