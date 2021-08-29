package com.demo;

public class ChildThreadWait extends Thread {
	
	public static Thread mt;

	//Defining a Thread
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		// JOB of a Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}	
}
