package com.nt.clonable;

public class Example implements Cloneable {
	
	int a=10,b=20;
	public static void main(String[] args)throws CloneNotSupportedException {
		Example e1= new Example();
		Example e2= (Example)e1.clone();
		Example e3=(Example)e2.clone();
		
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1 == e2);
		
		System.out.println(e1.a);
		System.out.println(e2.b);
		System.out.println(e2.a+"   "+e2.b);
		
		e2.a=30;
		e2.b=40;
		System.out.println(e2.a+"  "+e2.b);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
