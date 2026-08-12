// Last updated: 8/12/2026, 10:42:15 PM
1import java.util.*;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6
7        for (char c : word.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        Arrays.sort(freq);
12
13        int pushes = 0;
14        int count = 0;
15
16        for (int i = 25; i >= 0; i--) {
17            if (freq[i] == 0)
18                break;
19
20            pushes += freq[i] * (count / 8 + 1);
21            count++;
22        }
23
24        return pushes;
25    }
26}