package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementInArrayTest {

    private LargestElementInArray largestElementInArray;

    @Test
    void findLargest() {
        int[] data = {1,2,3,4,5};
        int largest = largestElementInArray.findLargest(data);
        assertEquals(5,largest);
    }

    @Test
    void findLargestTest2() {
        int[] data = {5,4,3,2,1};
        int largest = largestElementInArray.findLargest(data);
        assertEquals(5,largest);
    }

    @Test
    void findLargestTest3() {
        int[] data = {0,2,5,3,1};
        int largest = largestElementInArray.findLargest(data);
        assertEquals(5,largest);
    }

    @Test
    void findLargestTest4() {
        int[] data = {0,2,5,3,1,6};
        int largest = largestElementInArray.findLargest(data);
        assertEquals(6,largest);
    }
}
