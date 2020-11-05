package com.nt.collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NITCollection {
	private Object[] objArray;
	int index = 0;
	public NITCollection() {
		objArray = new Object[8];
		 index = 0;
	}
	//method
	public void add(Object obj) {
		//if(size()==capacity())
		
		objArray [index] =obj;
		index++;
	}
	
	private int capacity() {
		
		return objArray.length;
	}
	
	public int size() {
		return index;
	}
	void display() {
		System.out.println(Arrays.toString(objArray));
	}	
}
