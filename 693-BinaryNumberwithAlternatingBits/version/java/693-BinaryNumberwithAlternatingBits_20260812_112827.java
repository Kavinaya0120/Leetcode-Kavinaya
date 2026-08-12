// Last updated: 8/12/2026, 11:28:27 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = n & 1;
4        n >>= 1;
5
6        while (n > 0) {
7            int curr = n & 1;
8
9            if (curr == prev) {
10                return false;
11            }
12
13            prev = curr;
14            n >>= 1;
15        }
16
17        return true;
18    }
19}