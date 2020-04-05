package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void test(){
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.cache(19));
        assertTrue(happyNumber.cache(13));
        assertFalse(happyNumber.cache(5));
    }

}