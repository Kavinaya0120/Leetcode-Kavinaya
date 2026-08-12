// Last updated: 8/12/2026, 11:34:28 AM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
7
8        List<int[]> result = new ArrayList<>();
9
10        int start = intervals[0][0];
11        int end = intervals[0][1];
12
13        for (int i = 1; i < intervals.length; i++) {
14
15            if (intervals[i][0] <= end) {
16                end = Math.max(end, intervals[i][1]);
17            } else {
18                result.add(new int[]{start, end});
19
20                start = intervals[i][0];
21                end = intervals[i][1];
22            }
23        }
24
25        result.add(new int[]{start, end});
26
27        return result.toArray(new int[result.size()][]);
28    }
29}