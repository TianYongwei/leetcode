package leetcode;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0141LinkedListCycle2 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // 防止空指针
            if(fast.next == null) return false;

            if(fast == slow) return true;
        }
        return false;
    }
}