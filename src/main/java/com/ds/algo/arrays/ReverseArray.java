package com.ds.algo.arrays;

public class ReverseArray {

    public static int[] reverse(int[] data) {

        // [1,2,3,4] -> [4,3,2,1]
        // [1,2,3] -> [3,2,1]

        int start = 0;
        int end = data.length-1;

        while (end > start ) {
            int temp = data[end];
            data[end] = data[start];
            data[start] = temp;
            start++;
            end--;
        }

        return data;
    }
}
