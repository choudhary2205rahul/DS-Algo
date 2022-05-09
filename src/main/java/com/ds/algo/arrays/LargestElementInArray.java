package com.ds.algo.arrays;

// Date - 8-05-2022
public class LargestElementInArray {

    public static int findLargest(int[] data) {

        int largestElement = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > largestElement) {
                largestElement = data[i];
            }
        }

        return largestElement;
    }
}
