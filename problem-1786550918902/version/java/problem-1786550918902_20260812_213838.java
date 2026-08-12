// Last updated: 8/12/2026, 9:38:38 PM
1class Solution {
2    public int countSegments(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) != ' ' &&
7                (i == 0 || s.charAt(i - 1) == ' ')) {
8                count++;
9            }
10        }
11
12        return count;
13    }
14}