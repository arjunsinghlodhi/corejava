package com.nt.st;

public class StringComparision {

	public static void main(String[] args) {
		String str="Arjun Singh";
		
		System.out.println(str+"  lenght of String :"+str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointBefore(2));
		System.out.println("________________");
		System.out.println(str.substring(5));
		System.out.println(str.subSequence(0, 1));
		System.out.println(str.substring(1,2));
		System.out.println("_________________");
		System.out.println(str.compareTo("Singh"));
		System.out.println(str.compareToIgnoreCase("arjunsingh"));
		System.out.println(str.concat("lodhi"));
		System.out.println(str.contains("a"));
		System.out.println(str.contentEquals("ArjunSingh"));
		System.out.println(str.endsWith("h"));
		System.out.println(str.equalsIgnoreCase("arjunsingh"));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf("S"));
		System.out.println(str.indexOf(str));

		System.out.println(str.lastIndexOf("h"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.isEmpty());
		System.out.println(str.replace('A','s'));
		System.out.println(str.replaceAll(str, "rohit"));
		System.out.println(str.equalsIgnoreCase("Rohit"));
		System.out.println(str.split(" "));
		String [] s1=str.split(" ");
		System.out.println(str.split("gh"));
		str.trim();
		System.out.println("  arjun "+str);
	}
}
