// Last updated: 8/12/2026, 9:32:29 PM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        ListNode a = headA;
4        ListNode b = headB;
5
6        while (a != b) {
7            a = (a == null) ? headB : a.next;
8            b = (b == null) ? headA : b.next;
9        }
10
11        return a;
12    }
13}