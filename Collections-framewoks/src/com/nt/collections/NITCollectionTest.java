package com.nt.collections;

public class NITCollectionTest {

	public static void main(String[] args) {
		NITCollection col = new NITCollection();
		col.add("a");
		col.add("b");
		col.add("c");
		col.add("d");
		col.add(5);
		col.add(true); 
		col.display();
	}

}
