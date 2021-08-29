package com.demo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLock extends Thread {
  public static ReentrantLock lock = new ReentrantLock();
  
  public ReentrantTryLock(String name) {
	  super(name);
  }
  
//  public void run() {
//	  if (lock.tryLock()) {
//		  System.out.println(Thread.currentThread().getName() + "....got the lock and performing safe operations");
//		  try {
//			  Thread.sleep(2000);
//		  } catch(InterruptedException e) {
//			  System.out.println(e.getMessage());
//		  }
//		  lock.unlock();
//	  } else {
//		  System.out.println(Thread.currentThread().getName() + "....could not get the lock hence alternate operations are being performed");
//	  }
//  }
	public void run() {
		do {
			try {
				if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(
							Thread.currentThread().getName() + "....got the lock and performing safe operations");

					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
					System.out.println(Thread.currentThread().getName() + " has released the lock");
					lock.unlock();
					break;
				} else {
					System.out.println(Thread.currentThread().getName()
							+ "....could not get the lock hence alternate operations are being performed");
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
  
  
}
