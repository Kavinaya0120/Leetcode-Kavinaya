// Last updated: 8/12/2026, 10:03:32 PM
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3
4        int x1 = coordinates[0][0];
5        int y1 = coordinates[0][1];
6
7        int x2 = coordinates[1][0];
8        int y2 = coordinates[1][1];
9
10        for (int i = 2; i < coordinates.length; i++) {
11
12            int x = coordinates[i][0];
13            int y = coordinates[i][1];
14
15            // Cross multiplication avoids floating-point errors
16            if ((y - y1) * (x2 - x1) !=
17                (y2 - y1) * (x - x1)) {
18                return false;
19            }
20        }
21
22        return true;
23    }
24}