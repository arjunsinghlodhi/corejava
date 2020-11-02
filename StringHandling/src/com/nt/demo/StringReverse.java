package com.nt.demo;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("write any String");
		String str = sc.nextLine();
		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("palindrom String");
		}
		else {
			System.out.println("Not palindrom");
		}
	}
	

}
