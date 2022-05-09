package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestElementInArrayTest {

    private SmallestElementInArray smallestElementInArray;

    @Test
    void findSmallest() {
        int[] data = {5,2,3,1,4};
        int smallest = smallestElementInArray.findSmallest(data);

        assertEquals(1,smallest);

    }

    @Test
    void findSmallestTest2() {
        int[] data = {5,2,3,1,4,0};
        int smallest = smallestElementInArray.findSmallest(data);

        assertEquals(0,smallest);

    }

    @Test
    void findSmallestTest3() {
        int[] data = {-1,5,2,3,1,4,0};
        int smallest = smallestElementInArray.findSmallest(data);

        assertEquals(-1,smallest);

    }
}
