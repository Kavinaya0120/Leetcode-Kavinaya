// Last updated: 8/12/2026, 10:14:39 PM
1import java.util.*;
2
3class Solution {
4    public long largestPerimeter(int[] nums) {
5
6        Arrays.sort(nums);
7
8        long sum = 0;
9        long ans = -1;
10
11        for (int i = 0; i < nums.length; i++) {
12
13            if (i >= 2 && sum > nums[i]) {
14                ans = sum + nums[i];
15            }
16
17            sum += nums[i];
18        }
19
20        return ans;
21    }
22}