package com.ds.algo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestElementTest {

    private SecondLargestElement secondLargestElement;

    @Test
    void findSecondLargestElement() {

        int[] data = {1,2,3,4,5};
        int secondLargestEl = secondLargestElement.findSecondLargestElement(data);

        assertEquals(4,secondLargestEl);
    }

    @Test
    void findSecondLargestElementTest2() {

        int[] data = {1,2,3,4,5,6};
        int secondLargestEl = secondLargestElement.findSecondLargestElement(data);

        assertEquals(5,secondLargestEl);
    }

    @Test
    void findSecondLargestElementTest3() {

        int[] data = {-1,-2,-3,-4,-5,-6, 2};
        int secondLargestEl = secondLargestElement.findSecondLargestElement(data);

        assertEquals(-1,secondLargestEl);
    }

    @Test
    void findSecondLargestElementTest4() {

        int[] data = {-1,-2,-3,-4,-5,-6};
        int secondLargestEl = secondLargestElement.findSecondLargestElement(data);

        assertEquals(-2147483648,secondLargestEl);
    }
}
