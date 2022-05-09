package com.ds.algo.arrays;

public class InsertNewElementByReplacing {

    public static int[] updateArray(int[] data, int element, int index) {

        if (index > data.length) {
            return data;
        }

        // [1,2,3,_,_] -> [4,1,2,3,_] , length=5
        for (int i = data.length-2; i >= index; i--) {
            data[i+1] = data[i];
        }

        data[index] = element;

        return data;
    }
}
