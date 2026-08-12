// Last updated: 8/12/2026, 11:36:24 AM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5
6        StringBuilder result = new StringBuilder();
7
8        for (int i = words.length - 1; i >= 0; i--) {
9
10            result.append(words[i]);
11
12            if (i != 0) {
13                result.append(" ");
14            }
15        }
16
17        return result.toString();
18    }
19}