package com.nt.tostring;

public class Demo {
static int x=10;
static int y=10;
private static String string;

public static void main(String[] args) {
	Demo demo = new Demo();
	Demo demo1 = new Demo();
	
	String name="Arjun";
	String name1="Arjun2";
	
	
	System.out.println("double equal "+ (x == y));
	System.out.println("");
	
	System.out.println(name.equals(name1));
	System.out.println(name.hashCode());
	
	System.out.println(name == name1);
	System.out.println(name1.hashCode());
	System.out.println(demo.equals(demo1));
	System.out.println(demo == demo1);
	
	System.out.println(demo.hashCode());
	System.out.println(demo1.hashCode());
	System.out.println(demo.getClass());
	
}
}
