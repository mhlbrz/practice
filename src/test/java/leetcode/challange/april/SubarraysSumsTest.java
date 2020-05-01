package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraysSumsTest {

    SubarraysSums sums = new SubarraysSums();

    @Test
    public void subarraySum() {
        assertEquals(2, sums.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(5, sums.subarraySum(new int[]{-20, 10, -30, 20, -10, -5, -5}, -10));
    }
}