package com.assignment;

import java.util.Scanner;

public class HarmonicNumber {
	float harmonic = 1;
	int num;

	// Method to find Nth harmonic value
	public void harmonic() {
		// User Scanner to take input from User
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number :");
		num = s.nextInt();
		s.close();
		// code to find Nth Harmonic
		for (int i = 2; i <= num; i++) {
			harmonic += (float) 1 / i;
		}
		System.out.println("Nth Harmonic Value : " + harmonic);
	}

	// Driver code start execution from here
	public static void main(String[] args) {
		HarmonicNumber numObj = new HarmonicNumber();
		numObj.harmonic();
	}
}
