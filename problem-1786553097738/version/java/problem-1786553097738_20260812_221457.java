// Last updated: 8/12/2026, 10:14:57 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        for (int i = 0; i < numRows; i++) {
9
10            List<Integer> row = new ArrayList<>();
11
12            for (int j = 0; j <= i; j++) {
13
14                if (j == 0 || j == i) {
15                    row.add(1);
16                }
17                else {
18                    int value =
19                        result.get(i - 1).get(j - 1) +
20                        result.get(i - 1).get(j);
21
22                    row.add(value);
23                }
24            }
25
26            result.add(row);
27        }
28
29        return result;
30    }
31}