package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void stack() {

        MinStack stack = new MinStack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.top());
        assertEquals(10, stack.getMin());

        stack.pop();
        assertEquals(10, stack.top());

        stack.pop();
        assertEquals(40, stack.top());
        assertEquals(20, stack.getMin());
    }

}