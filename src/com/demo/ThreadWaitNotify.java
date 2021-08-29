package com.demo;

public class ThreadWaitNotify extends Thread {
	public int total = 0;

	public void run() {
		
		synchronized (this) {
			System.out.println("Child Thread Starts Calculation");
			for (int i = 1; i <= 100; i++) {
				this.total = this.total + i;
			} 		
			System.out.println("Child Thread giving notification");
			this.notify();
		}
		
     
		
	}
}
