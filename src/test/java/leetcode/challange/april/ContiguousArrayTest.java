package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContiguousArrayTest {

    @Test
    public void findMaxLen() {

        ContiguousArray ca = new ContiguousArray();

        assertEquals(2, ca.findMaxLen(new int[]{0,1}));
        assertEquals(2, ca.findMaxLen(new int[]{0,1,0}));
        assertEquals(2, ca.findMaxLen(new int[]{0,1,0,0,0,0,1,0}));
        assertEquals(8, ca.findMaxLen(new int[]{1,1,1,1,1,0,0,0,0}));
        assertEquals(8, ca.findMaxLen(new int[]{1,1,1,0,0,0,0,1,0,0}));
        assertEquals(8, ca.findMaxLen(new int[]{0,0,1,1,1,0,0,0,0,1,0,0}));
    }
}