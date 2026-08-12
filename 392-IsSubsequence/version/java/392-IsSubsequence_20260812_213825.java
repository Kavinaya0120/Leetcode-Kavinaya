// Last updated: 8/12/2026, 9:38:25 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i = 0;
4
5        for (int j = 0; j < t.length(); j++) {
6            if (i < s.length() && s.charAt(i) == t.charAt(j))
7                i++;
8        }
9
10        return i == s.length();
11    }
12}