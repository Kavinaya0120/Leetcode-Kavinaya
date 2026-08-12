// Last updated: 8/12/2026, 9:57:20 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int mid = s.length() / 2;
4        int count1 = 0;
5        int count2 = 0;
6
7        for (int i = 0; i < mid; i++) {
8            if (isVowel(s.charAt(i)))
9                count1++;
10        }
11
12        for (int i = mid; i < s.length(); i++) {
13            if (isVowel(s.charAt(i)))
14                count2++;
15        }
16
17        return count1 == count2;
18    }
19
20    private boolean isVowel(char c) {
21        return "aeiouAEIOU".indexOf(c) != -1;
22    }
23}