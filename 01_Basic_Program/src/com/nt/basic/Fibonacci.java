package com.nt.basic;
//print Fibonacci series, e.g. 1 1 2 3 5 8 13 ...
import java.util.Scanner;
// class should be public because JVM has outside class if we declare private class so JVM con't access our class
public class Fibonacci {
	public static void main(String[] args) {
		//take input from end user 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number =  ");
		int count =sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1+" \n"+n2);
		//here loop start to becoz n1 and n2 value alredy printed
		for (int i = 2; i < count ; i++) {
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
		}
	}
}
