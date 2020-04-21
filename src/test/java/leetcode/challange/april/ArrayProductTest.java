package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayProductTest {

    @Test
    public void productExceptSelf() {
        ArrayProduct ap = new ArrayProduct();
        assertArrayEquals(new int[]{24, 12, 8, 6}, ap.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{60, 40, 30, 24}, ap.productExceptSelf(new int[]{2, 3, 4, 5}));
    }
}