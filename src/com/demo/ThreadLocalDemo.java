package com.demo;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal<String> tl = new ThreadLocal<String>() {
			// How to set initial value using inner classes
			public String initialValue() {
				return "Kulshreshtha";
			}
		};
		
		// How to set value in threadlocal
		tl.set("Abhijeet");
		System.out.println(tl.get());

		// How to remove value from Threadlocal
		tl.remove();
		System.out.println(tl.get());

	}

}
