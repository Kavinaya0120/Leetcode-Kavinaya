// Last updated: 8/12/2026, 9:59:06 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (char c : word.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        Arrays.sort(freq);
10
11        int pushes = 0;
12        int position = 1;
13
14        for (int i = 25; i >= 0; i--) {
15            if (freq[i] == 0)
16                break;
17
18            pushes += freq[i] * position;
19
20            if ((26 - i) % 8 == 0)
21                position++;
22        }
23
24        return pushes;
25    }
26}