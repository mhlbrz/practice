public class ReverseLiknedList {

    public static ListNode iter(ListNode head) {
        ListNode rhead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = rhead;
            rhead = head;
            head = next;
        }
        return rhead;
    }

    public static ListNode recur(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rhead = recur(head.next);
        head.next.next = head;
        head.next = null;
        return rhead;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNode.fromArray(arr);
        head = iter(head);
        System.out.println(ListNode.toArray(head));
        head = recur(head);
        System.out.println(ListNode.toArray(head));
    }

}
