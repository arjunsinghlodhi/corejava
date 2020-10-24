package com.nt.basic;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three number");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float avg = (a+b+c)/3;
		System.out.println("avrage = "+avg);
		
	}

}
