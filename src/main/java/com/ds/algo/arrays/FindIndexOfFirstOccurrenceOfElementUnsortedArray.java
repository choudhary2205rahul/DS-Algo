package com.ds.algo.arrays;

public class FindIndexOfFirstOccurrenceOfElementUnsortedArray {

    public static int findIndex(int[] data, int element) {

        // search
        for (int i = 0; i < data.length; i++) {
            if(data[i] == element) {
                return i;
            }
        }


        // If not found return -1
        return -1;
    }

}
