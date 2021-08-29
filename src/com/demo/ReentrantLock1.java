package com.demo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {

	public static void main(String[] args) {
	  ReentrantLock lock = new ReentrantLock();
	  lock.lock();
	  lock.lock();
	  // Returns the number of hold
	  System.out.println(lock.getHoldCount());
	  
	  // Returns true if thread is locked
	  System.out.println(lock.isLocked());
	  
	  // Returns true if thread is acquired by current thread
	  System.out.println(lock.isHeldByCurrentThread());
	  
      // Returns 0 if no thread is waiting for the lock
	  System.out.println(lock.getQueueLength());
	  
	  lock.unlock();
	  
	  // Returns the number of hold
	  System.out.println(lock.getHoldCount());
	  
	  // Returns true if the thread is locked
	  System.out.println(lock.isLocked());  	  
	  lock.unlock();
	  
	  // Returns false if the thread is unlocked
	  System.out.println(lock.isLocked());  	  
	  
	  // Returns False if the fairness policy was not set
	  System.out.println(lock.isFair());
	}

}
