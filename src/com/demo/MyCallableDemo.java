package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableDemo {

	public static void main(String[] args) throws Exception {
		// Define Callable Threads
		MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };
		
		// Executor Service defininf pool of threads
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		// Execute jobs and get the output
		for(MyCallable job: jobs) {
			Future<Object> future = service.submit(job);
			System.out.println(future.get());
		}
		service.shutdown();
		
	}

}
