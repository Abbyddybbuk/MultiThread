package com.demo;

public class MyThreadInterrupt extends Thread {
	public void run() {
		try {
			// JOB of a Thread
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Aiyyo I got interrupted");
		}
	}
}
