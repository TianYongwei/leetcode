package leetcode.common;

import lombok.ToString;

@ToString
// 单向链表节点
public class ListNode {
  public int val;
  public ListNode next;
  public ListNode(int x) { val = x; }
}