package com.ds.algo.arrays;

public class SmallestElementInArray {

    public static int findSmallest(int[] data) {

        int smallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] < smallestElement) {
                smallestElement = data[i];
            }
        }

        return smallestElement;
    }
}
