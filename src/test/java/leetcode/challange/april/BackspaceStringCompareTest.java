package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareTest {

    @Test
    public void isMatch() {
        assertTrue(BackspaceStringCompare.isMatch("ab#c", "ad#c"));
        assertTrue(BackspaceStringCompare.isMatch("ab##", "c#d#"));
        assertTrue(BackspaceStringCompare.isMatch("a##c", "#a#c"));
        assertFalse(BackspaceStringCompare.isMatch("a#c", "b"));
        assertFalse(BackspaceStringCompare.isMatch("a", "#"));
    }

    @Test
    public void nextTrueCharInd() {
        String s;
        s = "";
        assertEquals(-1, BackspaceStringCompare.nextTrueCharInd(-1, s.getBytes()));

        s = "abc###";
        assertEquals(-1, BackspaceStringCompare.nextTrueCharInd(5, s.getBytes()));

        s = "abc##";
        assertEquals(0, BackspaceStringCompare.nextTrueCharInd(4, s.getBytes()));

        s = "abc##d";
        assertEquals(5, BackspaceStringCompare.nextTrueCharInd(5, s.getBytes()));

        s = "abc##dpo#";
        assertEquals(6, BackspaceStringCompare.nextTrueCharInd(8, s.getBytes()));

        s = "abc##dpo#";
        assertEquals(0, BackspaceStringCompare.nextTrueCharInd(4, s.getBytes()));
    }
}