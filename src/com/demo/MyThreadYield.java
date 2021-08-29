package com.demo;

public class MyThreadYield extends Thread {
	public void run() {
		// JOB of a Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}		
	}

}
