// Last updated: 8/12/2026, 9:58:26 PM
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] freq = new int[26];
4
5        for (String word : words) {
6            for (char c : word.toCharArray()) {
7                freq[c - 'a']++;
8            }
9        }
10
11        for (int count : freq) {
12            if (count % words.length != 0)
13                return false;
14        }
15
16        return true;
17    }
18}