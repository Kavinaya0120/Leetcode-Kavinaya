// Last updated: 8/12/2026, 9:57:21 PM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] words = s.split(" ");
4
5        StringBuilder result = new StringBuilder();
6
7        for (int i = 0; i < k; i++) {
8            if (i > 0)
9                result.append(" ");
10
11            result.append(words[i]);
12        }
13
14        return result.toString();
15    }
16}