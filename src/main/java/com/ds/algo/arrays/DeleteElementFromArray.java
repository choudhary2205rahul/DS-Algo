package com.ds.algo.arrays;

// Date - 7-05-2022
public class DeleteElementFromArray {

    public static int[] deleteFromArray(int[] data, int element) {

        int indexOfItemToDelete = -1;

        // Find index of element to delete
        for (int i = 0; i < data.length; i++) {
            if(data[i] == element) {
                indexOfItemToDelete = i;
                break;
            }
        }

        // Element not found
        if (indexOfItemToDelete == -1) {
            return data;
        }

        // [1,2,3,4,5] -> [1,2,4,5,_]
        for (int i = indexOfItemToDelete; i < data.length-1; i++) {
            data[i] = data[i+1];
        }

        data[data.length-1] = 0;

        return data;
    }
}
