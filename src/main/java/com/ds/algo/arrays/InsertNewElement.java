package com.ds.algo.arrays;

// Date - 7-05-2022
public class InsertNewElement {

    public static int[] insert(int[] data, int newElement, int index) {

        if (index > data.length-1 || index < 0) {
            return data;
        } else {
            data[index] = newElement;
        }

        return data;
    }
}
