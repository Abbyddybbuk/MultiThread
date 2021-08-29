package com.demo;

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();	
		
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<1; i++) {
			System.out.println("Main Thread");
		}
	}

}
