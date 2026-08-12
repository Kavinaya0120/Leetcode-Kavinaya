// Last updated: 8/12/2026, 10:46:35 PM
1class Solution {
2    public void reorderList(ListNode head) {
3
4        if (head == null || head.next == null)
5            return;
6
7        // Find middle
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast != null && fast.next != null) {
12            slow = slow.next;
13            fast = fast.next.next;
14        }
15
16        // Reverse second half
17        ListNode second = slow.next;
18        slow.next = null;
19
20        ListNode prev = null;
21
22        while (second != null) {
23            ListNode next = second.next;
24            second.next = prev;
25            prev = second;
26            second = next;
27        }
28
29        // Merge
30        ListNode first = head;
31        second = prev;
32
33        while (second != null) {
34
35            ListNode next1 = first.next;
36            ListNode next2 = second.next;
37
38            first.next = second;
39            second.next = next1;
40
41            first = next1;
42            second = next2;
43        }
44    }
45}