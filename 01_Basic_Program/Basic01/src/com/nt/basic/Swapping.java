package com.nt.basic;

public class Swapping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before Swapping");
		System.out.println("a="+a+"\nb="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("\n after swapping");
		System.out.println("a="+a+"\nb="+b);
	
	//Swapping without using three variable
	int a1=10;
	int a2=20;
	System.out.println("a1= "+a1+"/n a2= "+a2);
	a2=a2-a1;
	a1=a1+a1;
	System.out.println("");
	System.out.println("a1= "+a1+"/n a2= "+a2);
	
}
}
