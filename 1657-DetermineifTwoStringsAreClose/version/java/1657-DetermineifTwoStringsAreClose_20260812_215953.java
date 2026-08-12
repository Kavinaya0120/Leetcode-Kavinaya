// Last updated: 8/12/2026, 9:59:53 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3
4        if (word1.length() != word2.length())
5            return false;
6
7        int[] a = new int[26];
8        int[] b = new int[26];
9
10        for (char c : word1.toCharArray())
11            a[c - 'a']++;
12
13        for (char c : word2.toCharArray())
14            b[c - 'a']++;
15
16        // Both strings must contain the same characters
17        for (int i = 0; i < 26; i++) {
18            if ((a[i] == 0) != (b[i] == 0))
19                return false;
20        }
21
22        Arrays.sort(a);
23        Arrays.sort(b);
24
25        return Arrays.equals(a, b);
26    }
27}