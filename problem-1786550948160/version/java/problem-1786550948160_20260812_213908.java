// Last updated: 8/12/2026, 9:39:08 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int upper = 0;
4
5        for (char c : word.toCharArray()) {
6            if (Character.isUpperCase(c))
7                upper++;
8        }
9
10        return upper == 0 ||
11               upper == word.length() ||
12               (upper == 1 && Character.isUpperCase(word.charAt(0)));
13    }
14}