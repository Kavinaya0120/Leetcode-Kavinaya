// Last updated: 8/12/2026, 10:13:07 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3
4        String prefix = strs[0];
5
6        for (int i = 1; i < strs.length; i++) {
7
8            while (!strs[i].startsWith(prefix)) {
9                prefix = prefix.substring(0, prefix.length() - 1);
10
11                if (prefix.length() == 0)
12                    return "";
13            }
14        }
15
16        return prefix;
17    }
18}