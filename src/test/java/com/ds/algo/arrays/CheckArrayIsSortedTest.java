package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayIsSortedTest {

    private CheckArrayIsSorted checkArrayIsSorted;

    @Test
    void checkForSorted() {
        int[] data = {1,2,3,4,5};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertTrue(result);
    }

    @Test
    void checkForSortedTest1() {
        int[] data = {6,1,2,3,4,5};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertFalse(result);
    }

    @Test
    void checkForSortedTest2() {
        int[] data = {1,2,3,4,5,-1};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertFalse(result);
    }

    @Test
    void checkForSortedTest3() {
        int[] data = {5,6};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertTrue(result);
    }

    @Test
    void checkForSortedTest4() {
        int[] data = {1,1};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertTrue(result);
    }

    @Test
    void checkForSortedTest5() {
        int[] data = {-11,11};
        boolean result = checkArrayIsSorted.checkForSorted(data);
        assertTrue(result);
    }
}
