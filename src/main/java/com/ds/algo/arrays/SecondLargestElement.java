package com.ds.algo.arrays;

// Date - 9-05-2022
public class SecondLargestElement {

    public static int findSecondLargestElement(int[] data) {

        // [1,2,3,4,5]
        int largest = data[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > largest) {
                secondLargest = largest;
                largest = data[i];
            }
        }

        return secondLargest;
    }
}
