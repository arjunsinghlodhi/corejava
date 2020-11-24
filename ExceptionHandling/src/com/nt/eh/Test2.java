package com.nt.eh;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test2 {
public static void main(String[] args) throws FileNotFoundException  {
	PrintWriter pw = new PrintWriter("abc.txt");
	pw.println("hello");
	System.out.println("hi");
	}
}
