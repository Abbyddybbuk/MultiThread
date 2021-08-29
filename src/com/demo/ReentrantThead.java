package com.demo;

public class ReentrantThead extends Thread {
  private ReentrantLock2 reLock2;
  private String name;
  
  public ReentrantThead(ReentrantLock2 reLock2, String name) {
	  this.name = name;
	  this.reLock2 = reLock2;
  }
  
  public void run() {
	  reLock2.wish(name);
  }
  
}
