package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Test
    void removeDuplicates() {
        int[] data = {1,2,3,4,4,5};
        int[] newData = removeDuplicatesFromSortedArray.removeDuplicates(data);
        System.out.println(Arrays.toString(newData));

        int[] expected = {1,2,3,4,5,0};
        assertArrayEquals(expected,newData);
    }

    @Test
    void removeDuplicatesTest2() {
        int[] data = {2,3,4,4,5};
        int[] newData = removeDuplicatesFromSortedArray.removeDuplicates(data);
        System.out.println(Arrays.toString(newData));

        int[] expected = {2,3,4,5,0};
        assertArrayEquals(expected,newData);
    }

    @Test
    void removeDuplicatesTest3() {
        int[] data = {-2,3,4,4,5};
        int[] newData = removeDuplicatesFromSortedArray.removeDuplicates(data);

        int[] expected = {-2,3,4,5,0};
        assertArrayEquals(expected,newData);
    }
}
