package com.nt.clonable;

public class FinalizeDemo {
	

	public static void main(String[] args)throws Exception {
		for(int i=1;i<=10;i++) {
			new Building(new Furnitune());
	}
		
		System.gc();
		
		Thread.sleep(1000);
}
}
