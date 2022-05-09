package com.ds.algo.arrays;

// Date - 8-05-2022
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
