package com.assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumOfThree {
	private static final Logger logger = LogManager.getLogger(SumOfThree.class);
	 void findTriplets(int[] array, int n)
    {
        boolean found = false;
        //Code to find triplet with 0 sum
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                    	logger.info(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (found == false)
        	logger.info(" not exist ");
    }
 
}
