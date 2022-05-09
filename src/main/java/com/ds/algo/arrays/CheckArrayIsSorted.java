package com.ds.algo.arrays;

// Date - 9-05-2022
public class CheckArrayIsSorted {

    public static boolean checkForSorted(int[] data) {

        for (int i = 0; i < data.length-1; i++) {
            if(data[i] > data[i+1]) {
                return false;
            }
        }

        return true;
    }
}
