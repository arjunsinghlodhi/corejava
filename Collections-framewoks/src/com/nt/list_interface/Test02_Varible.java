package com.nt.list_interface;

import java.util.jar.Attributes.Name;

public class Test02_Varible {
	public static void main(String[] args) {
		//variable store once value at a time
		int a=20;
		System.out.println(a);
		//Array can store homogeneous value 
		int [] arr = {10,20};
		System.out.println(arr[0]);
		System.out.println(arr.length);
		System.out.println();
		for (int i : arr) {
			System.out.println(i);
		}
		Object obj = new Object();
			
	}
}
