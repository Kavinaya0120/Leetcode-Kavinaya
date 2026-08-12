// Last updated: 8/12/2026, 11:35:52 AM
1class Solution {
2
3    public String longestPalindrome(String s) {
4
5        if (s.length() < 2) {
6            return s;
7        }
8
9        int start = 0;
10        int end = 0;
11
12        for (int i = 0; i < s.length(); i++) {
13
14            int len1 = expand(s, i, i);
15            int len2 = expand(s, i, i + 1);
16
17            int len = Math.max(len1, len2);
18
19            if (len > end - start + 1) {
20
21                start = i - (len - 1) / 2;
22                end = i + len / 2;
23            }
24        }
25
26        return s.substring(start, end + 1);
27    }
28
29    private int expand(String s, int left, int right) {
30
31        while (left >= 0 &&
32               right < s.length() &&
33               s.charAt(left) == s.charAt(right)) {
34
35            left--;
36            right++;
37        }
38
39        return right - left - 1;
40    }
41}