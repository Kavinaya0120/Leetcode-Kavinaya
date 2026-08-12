// Last updated: 8/12/2026, 10:15:12 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3
4        int maxDiagonal = 0;
5        int maxArea = 0;
6
7        for (int[] d : dimensions) {
8
9            int length = d[0];
10            int width = d[1];
11
12            int diagonal =
13                length * length + width * width;
14
15            int area = length * width;
16
17            if (diagonal > maxDiagonal) {
18                maxDiagonal = diagonal;
19                maxArea = area;
20            }
21            else if (diagonal == maxDiagonal) {
22                maxArea = Math.max(maxArea, area);
23            }
24        }
25
26        return maxArea;
27    }
28}