package com.nt.basic;

public class Bicycle {
	int codence= 0;
	int speed= 0;
	int gear =1;
	
	void changecodence(int newvalue) {
		codence= newvalue;
	}
	
	void changegear(int newvalue) {
		gear=newvalue;
	}
	
	void speedUp(int increse) {
		speed=speed+increse;
	}
	
	void apllybrerak(int decrese) {
		speed=speed-decrese;
	}
	void display() {
		System.out.println("Max speed: "+codence);
		System.out.println("curent gear :"+gear);
		System.out.println("curent speed:"+speed);
	}
}
