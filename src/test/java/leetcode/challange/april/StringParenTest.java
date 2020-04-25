package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringParenTest {

    private StringParen sp = new StringParen();

    @Test
    public void checkValidString() {
        assertTrue(sp.checkValidString("()"));
        assertTrue(sp.checkValidString("(*)"));
        assertTrue(sp.checkValidString("(*))"));
        assertTrue(sp.checkValidString("((**)"));
        assertTrue(sp.checkValidString("***)))"));
        assertTrue(sp.checkValidString("(((***"));
        assertFalse(sp.checkValidString("***((("));
        assertFalse(sp.checkValidString("())"));
        assertFalse(sp.checkValidString("*("));
        assertFalse(sp.checkValidString("(*)()))"));
        assertTrue(sp.checkValidString("(*)())"));
        assertTrue(sp.checkValidString("(*((())*"));
        assertTrue(sp.checkValidString("(*((())*)"));
        assertFalse(sp.checkValidString("(*((()*"));
    }

}