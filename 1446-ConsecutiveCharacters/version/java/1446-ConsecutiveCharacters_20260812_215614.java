// Last updated: 8/12/2026, 9:56:14 PM
1class Solution {
2    public int maxPower(String s) {
3        int max = 1;
4        int count = 1;
5
6        for (int i = 1; i < s.length(); i++) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                count++;
9            } else {
10                count = 1;
11            }
12
13            max = Math.max(max, count);
14        }
15
16        return max;
17    }
18}