package com.demo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {
	private Integer num;

	public MyCallable(int num) {
		super();
		this.num = num;
	}

	public Object call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + " is responsible to find sum of first " + this.num + " numbers");
		
		Integer sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
