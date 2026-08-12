// Last updated: 8/12/2026, 9:59:34 PM
1class Solution {
2    public int findTheLongestBalancedSubstring(String s) {
3        int max = 0;
4        int zeros = 0;
5        int ones = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            if (s.charAt(i) == '0') {
10                zeros++;
11            } else {
12                ones++;
13
14                if (i > 0 && s.charAt(i - 1) == '0') {
15                    // Start of a group of 1s
16                }
17
18                max = Math.max(max, 2 * Math.min(zeros, ones));
19
20                if (i + 1 < s.length() &&
21                    s.charAt(i + 1) == '0') {
22                    zeros = 0;
23                    ones = 0;
24                }
25            }
26        }
27
28        return max;
29    }
30}