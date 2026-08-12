// Last updated: 8/12/2026, 9:29:08 PM
1class Solution {
2    public int vowelStrings(String[] words, int left, int right) {
3        int count = 0;
4
5        for (int i = left; i <= right; i++) {
6            String s = words[i];
7            char first = s.charAt(0);
8            char last = s.charAt(s.length() - 1);
9
10            if (isVowel(first) && isVowel(last)) {
11                count++;
12            }
13        }
14
15        return count;
16    }
17
18    private boolean isVowel(char c) {
19        return c == 'a' || c == 'e' || c == 'i' ||
20               c == 'o' || c == 'u';
21    }
22}