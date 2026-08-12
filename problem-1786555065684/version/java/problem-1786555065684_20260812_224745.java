// Last updated: 8/12/2026, 10:47:45 PM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3
4        ListNode smallDummy = new ListNode(0);
5        ListNode largeDummy = new ListNode(0);
6
7        ListNode small = smallDummy;
8        ListNode large = largeDummy;
9
10        while (head != null) {
11
12            if (head.val < x) {
13                small.next = head;
14                small = small.next;
15            } else {
16                large.next = head;
17                large = large.next;
18            }
19
20            head = head.next;
21        }
22
23        large.next = null;
24        small.next = largeDummy.next;
25
26        return smallDummy.next;
27    }
28}