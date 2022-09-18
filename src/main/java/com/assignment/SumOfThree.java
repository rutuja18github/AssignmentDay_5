package com.assignment;

public class SumOfThree {
	 void findTriplets(int[] array, int n)
    {
        boolean found = false;
        //Code to find triplet with 0 sum
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }
  
    // Driver code start execution from here
    public static void main(String[] args)
    {
    	SumOfThree sum=new SumOfThree();
        int array[] = { 0, -1, 2, -3, 1 };      //Initialize an Array
        int n = array.length;
        sum.findTriplets(array, n);
    }
}
