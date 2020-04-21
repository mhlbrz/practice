package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringShiftTest {

    @Test
    public void shift() {
        StringShift shift = new StringShift();
        assertEquals("cab", shift.shift("abc", new int[][]{{0, 1}, {1, 2}}));
        assertEquals("efgabcd", shift.shift("abcdefg", new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}}));
    }
}