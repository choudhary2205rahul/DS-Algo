package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    private ReverseArray reverseArray;

    @Test
    void reverse() {
        int[] data = {1,2,3,4};
        int[] reversed = reverseArray.reverse(data);

        int[] expected = {4,3,2,1};
        assertArrayEquals(expected, reversed);
    }

    @Test
    void reverseTest1() {
        int[] data = {1,2,3};
        int[] reversed = reverseArray.reverse(data);

        int[] expected = {3,2,1};
        assertArrayEquals(expected, reversed);
    }

    @Test
    void reverseTest2() {
        int[] data = {5,2,3,4};
        int[] reversed = reverseArray.reverse(data);

        int[] expected = {4,3,2,5};
        assertArrayEquals(expected, reversed);
    }

    @Test
    void reverseTest3() {
        int[] data = {-5,2,3,4};
        int[] reversed = reverseArray.reverse(data);

        int[] expected = {4,3,2,-5};
        assertArrayEquals(expected, reversed);
    }

    @Test
    void reverseTest4() {
        int[] data = {-5,2,3};
        int[] reversed = reverseArray.reverse(data);

        int[] expected = {3,2,-5};
        assertArrayEquals(expected, reversed);
    }
}
