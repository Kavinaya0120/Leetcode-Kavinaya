// Last updated: 8/12/2026, 9:32:47 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        ListNode temp = head;
4
5        for (int i = 0; i < k; i++) {
6            if (temp == null)
7                return head;
8
9            temp = temp.next;
10        }
11
12        ListNode prev = null;
13        ListNode curr = head;
14
15        for (int i = 0; i < k; i++) {
16            ListNode next = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = next;
20        }
21
22        head.next = reverseKGroup(curr, k);
23
24        return prev;
25    }
26}