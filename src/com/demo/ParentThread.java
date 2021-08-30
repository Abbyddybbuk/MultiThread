package com.demo;

public class ParentThread extends Thread {
//  public static ThreadLocal<String> tl = new ThreadLocal<String>();
  public static InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>();
  
  public void run() {
	  tl.set("PP");
	  System.out.println("Parent Thread Value is " + tl.get());
	  
	  ChildThreadLocal cTl = new ChildThreadLocal();
	  cTl.start();
  }
  
}
