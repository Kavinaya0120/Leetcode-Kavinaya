// Last updated: 8/12/2026, 10:04:28 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int current = nums[0];
5        int max = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8
9            current = Math.max(nums[i], current + nums[i]);
10
11            max = Math.max(max, current);
12        }
13
14        return max;
15    }
16}