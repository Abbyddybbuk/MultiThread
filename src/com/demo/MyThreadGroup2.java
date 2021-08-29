package com.demo;

public class MyThreadGroup2 {
	public static void main(String[] args) {
		ThreadGroup grp = new ThreadGroup("mygrp");
		Thread t1 = new Thread(grp, "First Thread");
		Thread t2 = new Thread(grp, "Second Thread");

		// Default priority of a thread is always 5
		System.out.println(t1.getPriority());

		// Default priority of a thread is always 5
		System.out.println(t2.getPriority());

		grp.setMaxPriority(3);

		Thread t3 = new Thread(grp, "Third Group");
		// Default priority of this thread will not change even if parent thread has
		// changed its priority
		System.out.println(t1.getPriority());

		// Default priority of this thread will not change even if parent thread has
		// changed its priority
		System.out.println(t2.getPriority());

		// Priority of this thread will be 3 as parent thread changed its priority
		System.out.println(t3.getPriority());
	}
}
