// Last updated: 8/12/2026, 11:45:08 AM
1import java.util.*;
2
3class Solution {
4    public int largestRectangleArea(int[] heights) {
5
6        Stack<Integer> stack = new Stack<>();
7        int maxArea = 0;
8
9        for (int i = 0; i <= heights.length; i++) {
10
11            int current = (i == heights.length)
12                    ? 0 : heights[i];
13
14            while (!stack.isEmpty() &&
15                   current < heights[stack.peek()]) {
16
17                int height = heights[stack.pop()];
18
19                int width = stack.isEmpty()
20                        ? i
21                        : i - stack.peek() - 1;
22
23                maxArea = Math.max(maxArea, height * width);
24            }
25
26            stack.push(i);
27        }
28
29        return maxArea;
30    }
31}