package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SwapTwoNumber {
	private static final Logger logger = LogManager.getLogger(SwapTwoNumber.class);
	int a;
	int b;
    
	//Logic for Swapping of two number 
	public void swapNumber() {
		// Use Scanner class to take input from user
		Scanner s = new Scanner(System.in);
		logger.info("Enter First Number a=");
		a = s.nextInt();
		logger.info("Enter Second Number b=");
		b = s.nextInt();
		s.close();
		a = a + b;
		b = a - b;
		a = a - b;
		logger.info("After swapping: ");
		logger.info("a=" + a + " b= " + b);
	}

}
