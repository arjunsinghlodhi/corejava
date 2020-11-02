package com.nt.st;

public class CharPosition {
public static void main(String[] args) {
	String str = "Welcome to string handling tutorial";

	char ch1 = str.charAt(0);
	char ch2= str.charAt(1);
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println("");
	for(int i = 0 ; i<= str.length()-1;i++) {
		System.out.println(str.charAt(i));
	}
}
}
