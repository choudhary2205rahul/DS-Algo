package com.ds.algo.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfFirstOccurrenceOfElementUnsortedArrayTest {

    private FindIndexOfFirstOccurrenceOfElementUnsortedArray findIndexOfFirstOccurrenceOfElement;

    @Test
    void findIndexOf6() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElement.findIndex(data, 6);
        assertEquals(-1, index);
    }

    @Test
    void findIndexOf1() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElement.findIndex(data, 1);
        assertEquals(0, index);
    }

    @Test
    void findIndexOf2() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElement.findIndex(data, 2);
        assertEquals(1, index);
    }

    @Test
    void findIndexOf3() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElement.findIndex(data, 3);
        assertEquals(2, index);
    }

    @Test
    void findIndexOfMinus1() {
        int[] data = {1,2,3,4,5};
        int index = findIndexOfFirstOccurrenceOfElement.findIndex(data, -1);
        assertEquals(-1, index);
    }
}
