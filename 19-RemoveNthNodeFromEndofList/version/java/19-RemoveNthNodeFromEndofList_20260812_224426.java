// Last updated: 8/12/2026, 10:44:26 PM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode fast = dummy;
8        ListNode slow = dummy;
9
10        for (int i = 0; i <= n; i++) {
11            fast = fast.next;
12        }
13
14        while (fast != null) {
15            fast = fast.next;
16            slow = slow.next;
17        }
18
19        slow.next = slow.next.next;
20
21        return dummy.next;
22    }
23}