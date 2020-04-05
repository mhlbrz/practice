package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZerosTest {

    @Test
    public void test() {
        int[] a1 = new int[]{0, 1, 0, 3, 12};
        int[] a2 = new int[]{0, 0, 0, 0, 12};
        int[] a3 = new int[]{1, 2, 3, 0, 0};
        int[] a4 = new int[]{1, 2, 3, 4, 5};

        MoveZeros.move(a1);
        MoveZeros.move(a2);
        MoveZeros.move(a3);
        MoveZeros.move(a4);

        assertArrayEquals(a1, new int[]{1, 3, 12, 0, 0});
        assertArrayEquals(a2, new int[]{12, 0, 0, 0, 0});
        assertArrayEquals(a3, new int[]{1, 2, 3, 0, 0});
        assertArrayEquals(a4, new int[]{1, 2, 3, 4, 5});
    }

}