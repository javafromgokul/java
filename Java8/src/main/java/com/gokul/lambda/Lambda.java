package com.gokul.lambda;

public class Lambda {
	
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("lambda");
		runnable.run();
	}
}
