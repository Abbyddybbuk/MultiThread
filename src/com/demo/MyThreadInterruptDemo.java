package com.demo;

public class MyThreadInterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThreadInterrupt myInter = new MyThreadInterrupt();
        myInter.start();
        myInter.interrupt();
        
        System.out.println("End of Main Thread");
	}

}
