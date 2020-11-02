package com.nt.operator;

public class JavaOperator {
	 public static void main(String[] args) {
		int i1= +5;
		System.out.println("i1 = "+i1);
		
		int i2= -6;
		System.out.println("i2 = "+i2);
		
		boolean b1 = !true;
		System.out.println("b1 = "+b1);
		
		/*
		 * binary operator
		 */
		
		int i3=7+8;
		System.out.println("i3 = "+i3);
		System.out.println();
		int i4=7&8;
		System.out.println("i4 = "+i4);
		
		boolean b3= 7<8;
		System.out.println("b3 = "+b3);
		
		boolean b4=7==8;
		System.out.println("b4 = "+b4);
		
		System.out.println();
		
		/**
		 * ternary operator
		 */
		
		System.out.println(true ?"Hi":"Hello");
		System.out.println(false ?"Hi":"Hello");
		
		String s1=true ? "Hi":"Hello";
		String s2=false ? "Hi":"Hello";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		String s3=true ? "Hi":"Hello";
		System.out.println(s3);
		
		String s4;
		if(true) {
			s4="Hi";
		}else {
			s4="Hello";
		}
		System.out.println("s4 = "+s4);
	}
}
