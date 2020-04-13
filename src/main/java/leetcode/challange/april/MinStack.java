package leetcode.challange.april;

import java.util.LinkedList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * <p>
 * Example:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {
    LinkedList<Integer> min;
    LinkedList<Integer> stack;

    public MinStack() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            min.push(x);
        } else {
            min.push(Math.min(min.peek(), x));
        }
        stack.push(x);
    }

    public void pop() {
        min.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
