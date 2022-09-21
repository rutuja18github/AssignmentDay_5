package com.assignment;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	// Driver code start execution from here
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		logger.info("Which program you want to run");
		logger.info("1.Harmonic Number");
		logger.info("2.Swapping of Two Number");
		logger.info("3.Sum Of Three Integer");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			HarmonicNumber harmonic = new HarmonicNumber();
			harmonic.harmonicNum();
			break;
		case "2":
			SwapTwoNumber swap = new SwapTwoNumber();
			swap.swapNumber();
			break;
		case "3":
			SumOfThree sum = new SumOfThree();
			int array[] = { 0, 1, 2, -3, 1 }; // Initialize an Array
			int n = array.length;
			sum.findTriplets(array, n);
			break;
		}
	}
}