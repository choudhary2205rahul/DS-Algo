package com.ds.algo.arrays;

// Date - 9-05-2022
public class RemoveDuplicatesFromSortedArray {

    public static int[] removeDuplicates(int[] data) {

        int result = 1;

        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[result-1]) {
                data[result] = data[i];
                result++;
            }
        }

        data[data.length-1] = 0;

        return data;
    }
}
