package com.assignment;

import java.util.Scanner;

public class SwapTwoNumber {
	int a;
	int b;
    
	//Logic for Swapping of two number 
	public void swapNumber() {
		// Use Scanner class to take input from user
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number a=");
		a = s.nextInt();
		System.out.print("Enter Second Number b=");
		b = s.nextInt();
		s.close();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: ");
		System.out.println("a=" + a + " b= " + b);
	}

	// Driver code start execution from here
	public static void main(String[] args) {
		SwapTwoNumber swapObj = new SwapTwoNumber();
		swapObj.swapNumber();
	}

}
