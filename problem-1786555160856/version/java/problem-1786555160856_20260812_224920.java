// Last updated: 8/12/2026, 10:49:20 PM
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3
4        ListNode slow = head;
5        ListNode fast = head;
6
7        while (fast != null && fast.next != null) {
8
9            slow = slow.next;
10            fast = fast.next.next;
11
12            if (slow == fast) {
13
14                slow = head;
15
16                while (slow != fast) {
17                    slow = slow.next;
18                    fast = fast.next;
19                }
20
21                return slow;
22            }
23        }
24
25        return null;
26    }
27}