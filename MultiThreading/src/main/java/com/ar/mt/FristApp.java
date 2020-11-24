package com.ar.mt;

public class FristApp extends Thread {
	
		public void run() {
			System.out.println("run executed");
		}
	
	public static void main(String[] args) {
		FristApp fa= new FristApp();
		fa.start();
		System.out.println("main Exeecuted");
	}

}
