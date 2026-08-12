// Last updated: 8/12/2026, 10:45:02 PM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode current = dummy;
8
9        while (current.next != null &&
10               current.next.next != null) {
11
12            ListNode first = current.next;
13            ListNode second = first.next;
14
15            first.next = second.next;
16            second.next = first;
17            current.next = second;
18
19            current = first;
20        }
21
22        return dummy.next;
23    }
24}