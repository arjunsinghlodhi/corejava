package com.nt.eh;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling ex = new ExceptionHandling();
		ex.m1();
	}
	 void m1() {
			System.out.println("1");
			
			try {
				System.out.println("2");
				System.out.println("3");
				System.out.println("4");
			} catch (Exception e) {
				System.out.println("5");
				System.out.println("6");
				System.out.println("7");
			}
			System.out.println("8");
	 }

}
