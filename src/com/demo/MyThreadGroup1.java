package com.demo;

public class MyThreadGroup1 {

	public static void main(String[] args) {
		// Thread Group of Main Thread is "main"
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		// Parent Group of Main is "System" Group
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		
		ThreadGroup grp = new ThreadGroup("First Group");
		
		ThreadGroup grp1 = new ThreadGroup(grp, "Second Group");
		System.out.println(grp1.getParent().getName());
	}

}
