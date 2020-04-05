package leetcode.algorithms;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int i) {
        val = i;
    }

    public static ArrayList<Integer> toArray(ListNode h){
        ArrayList<Integer> arr = new ArrayList<>();
        while (h != null){
            arr.add(h.val);
            h = h.next;
        }
        return arr;
    }

    public static ListNode fromArray(int[] arr){
        ListNode head = null;
        for (int i = arr.length - 1; i >= 0; i--){
            ListNode n = new ListNode(i);
            n.next = head;
            head = n;
        }
        return head;
    }
}
