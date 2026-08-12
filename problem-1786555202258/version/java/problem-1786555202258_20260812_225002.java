// Last updated: 8/12/2026, 10:50:02 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length())
5            return "";
6
7        int[] need = new int[128];
8
9        for (char c : t.toCharArray()) {
10            need[c]++;
11        }
12
13        int left = 0;
14        int count = t.length();
15
16        int minLength = Integer.MAX_VALUE;
17        int start = 0;
18
19        for (int right = 0; right < s.length(); right++) {
20
21            char c = s.charAt(right);
22
23            if (need[c] > 0)
24                count--;
25
26            need[c]--;
27
28            while (count == 0) {
29
30                if (right - left + 1 < minLength) {
31                    minLength = right - left + 1;
32                    start = left;
33                }
34
35                char leftChar = s.charAt(left);
36
37                need[leftChar]++;
38
39                if (need[leftChar] > 0)
40                    count++;
41
42                left++;
43            }
44        }
45
46        return minLength == Integer.MAX_VALUE
47                ? ""
48                : s.substring(start, start + minLength);
49    }
50}