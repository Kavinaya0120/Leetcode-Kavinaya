// Last updated: 8/12/2026, 11:50:09 AM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3
4        long left = 1;
5        long right = num;
6
7        while (left <= right) {
8
9            long mid = left + (right - left) / 2;
10
11            long square = mid * mid;
12
13            if (square == num)
14                return true;
15
16            if (square < num)
17                left = mid + 1;
18            else
19                right = mid - 1;
20        }
21
22        return false;
23    }
24}