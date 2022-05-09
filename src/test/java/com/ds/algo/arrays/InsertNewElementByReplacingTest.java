package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertNewElementByReplacingTest {

    private InsertNewElementByReplacing insertNewElementByReplacing;

    @Test
    void updateArray() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElementByReplacing.updateArray(data, 4, 0);

        int[] expected = new int[5];
        expected[0] = 4;
        expected[1] = 1;
        expected[2] = 2;
        expected[3] = 3;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest2() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElementByReplacing.updateArray(data, 4, 1);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 4;
        expected[2] = 2;
        expected[3] = 3;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest3() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElementByReplacing.updateArray(data, 4, 2);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 4;
        expected[3] = 3;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest4() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElementByReplacing.updateArray(data, 4, 3);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest5() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;

        int[] newData = insertNewElementByReplacing.updateArray(data, 4, 4);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[4] = 4;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest6() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;

        int[] newData = insertNewElementByReplacing.updateArray(data, 5, 0);

        int[] expected = new int[5];
        expected[0] = 5;
        expected[1] = 1;
        expected[2] = 2;
        expected[3] = 3;
        expected[4] = 4;

        assertArrayEquals(expected, newData);
    }

    @Test
    void updateArrayTest7() {
        int[] data = new int[5];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;

        int[] newData = insertNewElementByReplacing.updateArray(data, 5, 6);

        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;

        assertArrayEquals(expected, newData);
    }
}
