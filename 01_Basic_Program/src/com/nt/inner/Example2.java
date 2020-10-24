package com.nt.inner;

public class Example2 {

	static {
		System.out.println("outer class loading");
	}
	
	static class A{
		static {
			System.out.println("outer class loading");
		}
		public static void main(String[] args) {
			System.out.println("inner class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("outer class main methodc");
	}

}
