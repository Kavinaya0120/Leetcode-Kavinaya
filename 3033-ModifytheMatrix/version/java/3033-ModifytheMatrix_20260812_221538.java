// Last updated: 8/12/2026, 10:15:38 PM
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        for (int j = 0; j < n; j++) {
8
9            int max = 0;
10
11            for (int i = 0; i < m; i++) {
12                max = Math.max(max, matrix[i][j]);
13            }
14
15            for (int i = 0; i < m; i++) {
16                if (matrix[i][j] == -1) {
17                    matrix[i][j] = max;
18                }
19            }
20        }
21
22        return matrix;
23    }
24}