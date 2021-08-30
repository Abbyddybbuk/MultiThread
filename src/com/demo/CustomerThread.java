package com.demo;

public class CustomerThread extends Thread {
	static Integer custId = 0;
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
    public CustomerThread(String name) {
    	super(name);
    }
    
    public void run() {
    	System.out.println(Thread.currentThread().getName() + " executing with Customer id: " + tl.get());
    }
}
