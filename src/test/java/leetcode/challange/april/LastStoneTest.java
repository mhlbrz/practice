package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneTest {

    @Test
    public void lastStoneWeight() {
        LastStone lastStone = new LastStone();
        int[] arr = new int[]{2,7,4,1,8,1};
        assertEquals(1, lastStone.lastStoneWeight(arr));
    }
}