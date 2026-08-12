// Last updated: 8/12/2026, 10:45:26 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        for (int i = 1; i < left; i++)
10            prev = prev.next;
11
12        ListNode current = prev.next;
13
14        for (int i = 0; i < right - left; i++) {
15
16            ListNode next = current.next;
17
18            current.next = next.next;
19            next.next = prev.next;
20            prev.next = next;
21        }
22
23        return dummy.next;
24    }
25}