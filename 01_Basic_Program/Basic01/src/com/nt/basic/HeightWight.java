package com.nt.basic;

import java.util.Scanner;

public class HeightWight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Width ");
		float w = sc.nextFloat();
		System.out.println("Enter value of Height ");
		float h = sc.nextFloat();
		float area=w*h;
		System.out.println("Area="+area);
		float perameter=2*(w+h);
		System.out.println("peramiter="+perameter);
	}

}
