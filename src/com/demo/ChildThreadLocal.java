package com.demo;

public class ChildThreadLocal extends Thread {
	public void run() {
		System.out.println("Child Value: " + ParentThread.tl.get());
	}
}
