package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DeleteElementFromArrayTest {

    private DeleteElementFromArray deleteElementFromArray;

    @Test
    void deleteArray() {
        int[] data = {1,2,3,4,5};
        int[] result = deleteElementFromArray.deleteFromArray(data, 3);

        int[] expected = {1,2,4,5,0};
        assertArrayEquals(expected, result);

    }

    @Test
    void deleteArrayTest2() {
        int[] data = {5,2,3,4,7};
        int[] result = deleteElementFromArray.deleteFromArray(data, 5);

        int[] expected = {2,3,4,7,0};
        assertArrayEquals(expected, result);

    }

    @Test
    void deleteArrayTest3() {
        int[] data = {5,2,3,4,7};
        int[] result = deleteElementFromArray.deleteFromArray(data, 8);

        int[] expected = {5,2,3,4,7};
        assertArrayEquals(expected, result);

    }
}
