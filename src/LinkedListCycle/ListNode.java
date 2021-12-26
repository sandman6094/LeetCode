package LinkedListCycle;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;

            if (first == second) {
                return true;
            }
        }

        return false;
    }
}
