package com.demo;

public class ChildThreadWaitDemo {
	public static void main(String[] args) {
		
		ChildThreadWait.mt = Thread.currentThread();
		
		ChildThreadWait chld = new ChildThreadWait();
		chld.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}					
		
	}
}
