package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertNewElementTest {

    private InsertNewElement insertNewElement;

    @Test
    void insertNewElement() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElement.insert(data, 4, 3);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;

        assertArrayEquals(expected, newData);

    }

    @Test
    void insertNewElementTest2() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElement.insert(data, 5, 4);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[4] = 5;

        assertArrayEquals(expected, newData);

    }

    @Test
    void insertNewElementTest3() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElement.insert(data, 5, 5);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;

        assertArrayEquals(expected, newData);

    }

    @Test
    void insertNewElementTest4() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElement.insert(data, 5, 6);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;

        assertArrayEquals(expected, newData);

    }

    @Test
    void insertNewElementTest5() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElement.insert(data, 5, -1);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;

        assertArrayEquals(expected, newData);

    }
}
