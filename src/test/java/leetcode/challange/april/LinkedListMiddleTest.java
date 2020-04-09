package leetcode.challange.april;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListMiddleTest {

    @Test
    public void getMiddle() {
        ListNode[] arr = new ListNode[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = new ListNode(i);
        }
        for (int i = 0; i < 19; i++) {
            arr[i].next = arr[i + 1];
        }

        assertEquals(10, LinkedListMiddle.getMiddle(arr[0]).val);
        assertEquals(10, LinkedListMiddle.getMiddle(arr[1]).val);
        assertEquals(18, LinkedListMiddle.getMiddle(arr[17]).val);
        assertEquals(17, LinkedListMiddle.getMiddle(arr[15]).val);
        assertEquals(null, LinkedListMiddle.getMiddle(null));
    }

}