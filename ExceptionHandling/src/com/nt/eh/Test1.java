package com.nt.eh;

public class Test1 {

	public static void main(String[] args) {
		
			dostup();
	}
	private static void dostup() {
		
		try {
			int a= 10;
			int b=0;
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("can't divide into zero"+e);
		}
		
		
	}

}
