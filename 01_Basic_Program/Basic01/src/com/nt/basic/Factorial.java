package com.nt.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i, fact = 1;/*
						 * Scanner sc= new Scanner(System.in); number = sc.nextInt();
						 */
		
		/*if(number < 0)
		{
			System.out.println("Number must be greater to Zero");
		}*/
		
			for(i=1;i<=5;i++) {
				fact= fact*i;
				System.out.println(fact+"factorial of");
		}
	}

}
