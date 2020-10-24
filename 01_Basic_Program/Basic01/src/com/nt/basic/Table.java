package com.nt.basic;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int a=sc.nextInt();
		for (int i = 1; i <= 12; i++) {
			System.out.println(a*i);
		}
	}
}
