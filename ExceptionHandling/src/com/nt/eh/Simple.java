package com.nt.eh;

import java.util.Scanner;

public class Simple {
	
	private static int m1(int a,int b) {
		return (a/b);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a = ");
		int a=sc.nextInt();
		System.out.print("Enter value of b = ");
		int b=sc.nextInt();
		
		try {		
				float c = m1(a,b);
	
		} catch (ArithmeticException e) {
			//System.out.println("value of b must be grater to zere ");
			while(b==0) {
				System.out.println("value of b must be grater to zere ");
				System.out.print("again Enter value of b = ");
				 b=sc.nextInt();
				 if(b!=0) {
					 System.out.println(m1(a,b));
				 }
				 else 
					 continue;
			}
		}
	
		}
}

