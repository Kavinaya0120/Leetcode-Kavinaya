// Last updated: 8/12/2026, 10:44:13 PM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        long left = 0;
5        long right = 0;
6
7        for (int num : nums) {
8            left = Math.max(left, num);
9            right += num;
10        }
11
12        while (left < right) {
13            long mid = left + (right - left) / 2;
14
15            int parts = 1;
16            long sum = 0;
17
18            for (int num : nums) {
19                if (sum + num > mid) {
20                    parts++;
21                    sum = num;
22                } else {
23                    sum += num;
24                }
25            }
26
27            if (parts <= k)
28                right = mid;
29            else
30                left = mid + 1;
31        }
32
33        return (int) left;
34    }
35}