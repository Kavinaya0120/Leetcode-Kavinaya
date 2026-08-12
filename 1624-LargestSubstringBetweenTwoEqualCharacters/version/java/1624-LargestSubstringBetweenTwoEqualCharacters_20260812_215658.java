// Last updated: 8/12/2026, 9:56:58 PM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int[] first = new int[26];
4
5        for (int i = 0; i < 26; i++)
6            first[i] = -1;
7
8        int max = -1;
9
10        for (int i = 0; i < s.length(); i++) {
11            int index = s.charAt(i) - 'a';
12
13            if (first[index] == -1) {
14                first[index] = i;
15            } else {
16                max = Math.max(max, i - first[index] - 1);
17            }
18        }
19
20        return max;
21    }
22}