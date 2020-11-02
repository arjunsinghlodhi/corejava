package com.nt.st;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	System.out.println("String Reverse");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String s =sc.next();
	System.out.println(s.length());
	String Rev ="";
	System.out.println("your name is : "+s);
	for (int i = s.length()-1 ;  i >=0; i--) {
		Rev = Rev+s.charAt(i);
	}
	System.out.println("Reverse : "+Rev);
}
}
