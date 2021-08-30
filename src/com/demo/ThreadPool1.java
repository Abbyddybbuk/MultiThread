package com.demo;

public class ThreadPool1 implements Runnable {

	private String name;

	public ThreadPool1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Thread started by " + name + " and thread name is " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thread completed " + name + " and thread name is " + Thread.currentThread().getName());
	}

}
