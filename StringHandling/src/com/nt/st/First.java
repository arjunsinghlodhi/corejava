package com.nt.st;

public class First {

	public static void main(String[] args) {
		String s1 = "Arjun";
		String s2 = s1;
		System.out.println("s1 : "+ s1 + "\ns2 : "+s2);
		System.out.println("HashCode S1 :"+s1.hashCode());
		System.out.println("HashCode S2 :"+s2.hashCode());
		System.out.println(s1==s2);
		System.out.println("---------------------------");
		s1 +="Singh";
		System.out.println(s1.length());
		System.out.println(s2);
		System.out.println("HashCode S1 :"+s1.hashCode());
		System.out.println("HashCode S2 :"+s2.hashCode());
		System.out.println(s1==s2);
		
	}

}
