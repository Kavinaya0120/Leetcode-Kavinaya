// Last updated: 8/12/2026, 11:39:26 AM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5
6        int n = nums.length;
7        int[] result = new int[n - k + 1];
8
9        Deque<Integer> deque = new ArrayDeque<>();
10
11        for (int i = 0; i < n; i++) {
12
13            // Remove elements outside the window
14            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
15                deque.pollFirst();
16            }
17
18            // Remove smaller elements
19            while (!deque.isEmpty() &&
20                   nums[deque.peekLast()] <= nums[i]) {
21                deque.pollLast();
22            }
23
24            deque.addLast(i);
25
26            // Start storing answers when window reaches size k
27            if (i >= k - 1) {
28                result[i - k + 1] = nums[deque.peekFirst()];
29            }
30        }
31
32        return result;
33    }
34}