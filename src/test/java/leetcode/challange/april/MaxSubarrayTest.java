package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubarrayTest {

    @Test
    public void test() {
        int[] arr1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = new int[]{-2, -10, -1};
        int[] arr3 = new int[]{1, 2, 3, 4, -10};
        int[] arr4 = new int[]{1, 2, 3, 4};
        int[] arr5 = new int[]{-3, -2, -2, -4};

        assertEquals(6, MaxSubarray.linear(arr1));
        assertEquals(-1, MaxSubarray.linear(arr2));
        assertEquals(10, MaxSubarray.linear(arr3));
        assertEquals(10, MaxSubarray.linear(arr4));
        assertEquals(-2, MaxSubarray.linear(arr5));

        assertEquals(6, MaxSubarray.divideConquer(arr1));
        assertEquals(-1, MaxSubarray.divideConquer(arr2));
        assertEquals(10, MaxSubarray.divideConquer(arr3));
        assertEquals(10, MaxSubarray.divideConquer(arr4));
        assertEquals(-2, MaxSubarray.divideConquer(arr5));
    }

}