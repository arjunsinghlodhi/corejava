package com.nt.basic;

import java.util.Scanner;

public class Bodmas_mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a = sc.nextInt();
		System.out.print("Enter second Number = ");
		int b = sc.nextInt();
		int sum= a+b;
		int sub=a-b;
		int multi=a*b;
		System.out.println(sum+"\n"+sub+"\n"+multi);
		if(a>b) {
			float div =a/b;
			float mod =a%b;
			System.out.println(div+"\n"+mod);
		}else {
			System.out.println("value of A alway biggest to value of B ");
		}
	}

}
