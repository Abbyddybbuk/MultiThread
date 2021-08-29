package com.demo;

public class ReentrantThreadDemo {
	public static void main(String[] args) {
		ReentrantLock2 display = new ReentrantLock2();
		ReentrantThead t1 = new ReentrantThead(display, "ABC");
		ReentrantThead t2 = new ReentrantThead(display, "XYZ");
		ReentrantThead t3 = new ReentrantThead(display, "DEF");
		t1.start();
		t2.start();
		t3.start();
	}
}
