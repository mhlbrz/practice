package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingElementsTest {

    @Test
    public void count() {
        assertEquals(2, CountingElements.count(new int[]{1, 2, 3}));
        assertEquals(0, CountingElements.count(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        assertEquals(3, CountingElements.count(new int[]{1, 3, 2, 3, 5, 0}));
        assertEquals(2, CountingElements.count(new int[]{1, 1, 2, 2}));
        assertEquals(2, CountingElements.count(new int[]{1, 1, 2}));
    }
}