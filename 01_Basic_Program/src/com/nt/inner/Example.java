package com.nt.inner;

public class Example {

	static int a =10;
	int b =20;
	private int c=30;
	
	static class A{
		public static void main(String[] args) {
			System.out.println(a);
			//System.out.println(b);
			//System.out.println(c);
			
			Example ex = new Example();
			System.out.println(ex.b);
			System.out.println(ex.c);
			
			A a1 = new A();
			//System.out.println(a1.b);
		}
		
	}

}
