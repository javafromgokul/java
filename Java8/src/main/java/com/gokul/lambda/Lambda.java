package com.gokul.lambda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lambda {
	
	private static Logger logger = Logger.getLogger(Lambda.class.getName());  
	public static void main(String[] args) {
		Runnable runnable = () -> logger.log(Level.INFO, "lambda");
		runnable.run();
	}
}
