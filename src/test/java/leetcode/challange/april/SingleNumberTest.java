package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void test() {
        int[] arr1 = new int[]{2, 2, 1};
        int[] arr2 = new int[]{4, 1, 2, 1, 2};

        assertEquals(SingleNumber.hashMapSolution(arr1),  1);
        assertEquals(SingleNumber.hashMapSolution(arr2),  4);
        assertEquals(SingleNumber.binarySolution(arr1), 1);
        assertEquals(SingleNumber.hashMapSolution(arr2), 4);
    }

}