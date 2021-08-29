package com.demo;

public class ReentrantTryLockDemo {
	public static void main(String[] args) {
		ReentrantTryLock t1 = new ReentrantTryLock("First Thread");
		ReentrantTryLock t2 = new ReentrantTryLock("Second Thread");
		t1.start();
		t2.start();
	}
}
