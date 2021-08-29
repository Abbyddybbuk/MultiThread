package com.demo;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i=0; i<1; i++) {
			System.out.println("Child Thread");
		}
	}

}
