package com.gokul.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FunctionalInterfaceTest {
	private static Logger logger = Logger.getLogger(FunctionalInterfaceTest.class.getName());  

	public static void main(String[] args) throws Exception {
		TestInterface testInterface = () -> logger.log(Level.INFO, "functional");
		testInterface.hey();
		
		Runnable runnable = () -> logger.log(Level.INFO, "runnable");
		runnable.run();
		
		Callable<String> callable = () -> "callable";
		logger.log(Level.INFO, callable.call());
		
		Comparator<Device> comparator = (device1, device2) -> {
			if(device1.getPrice() > device2.getPrice())
				return 1;
			else if(device1.getPrice() < device2.getPrice())
				return -1;
			else 
				return 0;
		};
		
		List<Device> devices = Arrays.asList(new Device(12, "phone"), new Device(13, "lap"), new Device(1, "tab"));
		Collections.sort(devices, comparator);
	}
}
