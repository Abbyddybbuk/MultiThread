package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1Demo {

	public static void main(String[] args) {
		// Define Thread Pools as an Array
		ThreadPool1[] jobs = { new ThreadPool1("A"), new ThreadPool1("B"), new ThreadPool1("C"), new ThreadPool1("D"),
				new ThreadPool1("E"), new ThreadPool1("F") };
		
		// Create a Pool of available threads as 3
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		// Loop over all threads and execute jobs
		for (ThreadPool1 thPool: jobs) {
			service.submit(thPool);
		}
		
		service.shutdown();
	}

}
