package com.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock {

    private final AtomicInteger counter = new AtomicInteger(0);
    
    public int getValue() {
        return counter.get();
    }	
	
	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			System.out.println("Running Thread");
			i++;
			if (i==10) {
				return;
			}
		}

	}
	
    public void increment() {
        while(true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if(counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }	

}
