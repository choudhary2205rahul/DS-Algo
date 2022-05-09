package com.ds.algo.arrays;

// Date - 7-05-2022
public class FindIndexOfFirstOccurrenceOfElementSortedArray {

    public static int findIndex(int[] data, int element) {

        // first check length, if element is greater than return -1
        if (element > data.length) {
            return -1;
        }

        // search element if not found return -1
        int index = FindIndexOfFirstOccurrenceOfElementUnsortedArray.findIndex(data, element);
        if (index == -1) {
            return -1;
        }

        // return by subtract -1
        return element-1;

    }

    public static int findIndexReverseSorted(int[] data, int element) {

        // first check length, if element is greater than return -1
        if (element > data.length) {
            return -1;
        }

        // search element if not found return -1
        int index = FindIndexOfFirstOccurrenceOfElementUnsortedArray.findIndex(data, element);
        if (index == -1) {
            return -1;
        }

        // return
        return data[0]-element;

    }

}
