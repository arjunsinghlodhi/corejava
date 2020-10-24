package com.nt.basic;

public class BicycleTest {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle();
		bike1.changecodence(50);
		bike1.changegear(2);
		bike1.speedUp(20);
		bike1.display();
		System.out.println();
		//create second object
		Bicycle bike2 =new Bicycle();
		bike2.changecodence(120);
		bike2.changegear(1);
		bike2.speedUp(10);
		bike2.changegear(2);
		bike2.speedUp(20);
		bike2.changegear(3);
		bike2.speedUp(30);
		bike2.changegear(4);
		bike2.speedUp(50);
		bike2.apllybrerak(10);
		bike2.display();
		
	}

}
