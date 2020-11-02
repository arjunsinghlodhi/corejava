package com.nt.st;

public class Example {
	public static void main(String[] args) {
		/*
		 * Create Empty String Object Sting()
		 */
		String str =new String();
		System.out.println(str);
		
		/*
		 * String (String value)
		 * copy String
		 */
		
		String str1="abc";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		String str2=new String(str1);
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println();
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		String str4="arjun";
		String str5=str4;
		System.out.println(str4 +"   "+str5);
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		
	}
}
