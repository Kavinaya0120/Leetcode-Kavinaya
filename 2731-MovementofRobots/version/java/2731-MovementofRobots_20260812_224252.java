// Last updated: 8/12/2026, 10:42:52 PM
1import java.util.*;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        int n = nums.length;
6        long MOD = 1000000007L;
7
8        long[] pos = new long[n];
9
10        for (int i = 0; i < n; i++) {
11            if (s.charAt(i) == 'R')
12                pos[i] = (long) nums[i] + d;
13            else
14                pos[i] = (long) nums[i] - d;
15        }
16
17        Arrays.sort(pos);
18
19        long answer = 0;
20        long prefix = 0;
21
22        for (int i = 0; i < n; i++) {
23            answer = (answer + pos[i] * i - prefix) % MOD;
24            prefix = (prefix + pos[i]) % MOD;
25        }
26
27        return (int) answer;
28    }
29}