package com.nt.clonable;

public class Building{
	Furnitune f;
	Building (Furnitune f){
		this.f=f;
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		f=null;
	}
}
