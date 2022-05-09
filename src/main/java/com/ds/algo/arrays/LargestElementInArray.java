package com.ds.algo.arrays;

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
