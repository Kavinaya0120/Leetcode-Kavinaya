// Last updated: 8/12/2026, 10:47:38 PM
1
2class Solution {
3    public ListNode deleteDuplicates(ListNode head) {
4
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7
8        ListNode prev = dummy;
9        ListNode current = head;
10
11        while (current != null) {
12
13            boolean duplicate = false;
14
15            while (current.next != null &&
16                   current.val == current.next.val) {
17
18                duplicate = true;
19                current = current.next;
20            }
21
22            if (duplicate) {
23                prev.next = current.next;
24            } else {
25                prev = prev.next;
26            }
27
28            current = current.next;
29        }
30
31        return dummy.next;
32    }
33}