package com.demo;

public class MyThreadYieldDemo {

	public static void main(String[] args) {
		MyThreadYield myTh = new MyThreadYield();
		myTh.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}				

	}

}
