package com.demo;

public class ThreadWaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadWaitNotify  thWN = new ThreadWaitNotify();
		thWN.start();
		
		synchronized (thWN) {
			System.out.println("Main Thread calling Wait Method");
			thWN.wait();
			
			System.out.println("Maintain got notified");
			System.out.println(thWN.total);
		}
	}

}
