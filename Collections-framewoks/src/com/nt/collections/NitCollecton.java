package com.nt.collections;

public class NitCollecton {
	private Object[] objArray;
	private int index;
	
	public NitCollecton() {
		objArray = new Object[5];
		index =0;
	}
	
	
	//array size problems
	
	public void add(Object obj) {
		objArray[index++]=obj;
	}
}
