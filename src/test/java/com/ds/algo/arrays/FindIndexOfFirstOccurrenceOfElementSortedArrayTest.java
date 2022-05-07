package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfFirstOccurrenceOfElementSortedArrayTest {

    private FindIndexOfFirstOccurrenceOfElementSortedArray findIndexOfFirstOccurrenceOfElementSortedArray;

    @Test
    void findIndexOf6() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndex(data, 6);
        assertEquals(-1, index);
    }

    @Test
    void findIndexOf1() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndex(data, 1);
        assertEquals(0, index);
    }

    @Test
    void findIndexOf2() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndex(data, 2);
        assertEquals(1, index);
    }

    @Test
    void findIndexOf3() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndex(data, 3);
        assertEquals(2, index);
    }

    @Test
    void findIndexOfMinus1() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndex(data, -1);
        assertEquals(-1, index);
    }

    @Test
    void findIndexOf5() {
        int[] data = {5,4,3,2,1};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndexReverseSorted(data, 5);
        assertEquals(0, index);
    }

    @Test
    void findIndexOf4() {
        int[] data = {5,4,3,2,1};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndexReverseSorted(data, 4);
        assertEquals(1, index);
    }

    @Test
    void findIndexOfMinus2() {
        int[] data = {5,4,3,2,1};
        int index = findIndexOfFirstOccurrenceOfElementSortedArray.findIndexReverseSorted(data, -2);
        assertEquals(-1, index);
    }
}
