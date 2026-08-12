// Last updated: 8/12/2026, 11:48:33 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        int n = nums.length;
5        int[] result = new int[n];
6
7        int left = 0;
8        int right = n - 1;
9
10        for (int i = n - 1; i >= 0; i--) {
11
12            if (Math.abs(nums[left]) >
13                Math.abs(nums[right])) {
14
15                result[i] = nums[left] * nums[left];
16                left++;
17
18            } else {
19
20                result[i] = nums[right] * nums[right];
21                right--;
22            }
23        }
24
25        return result;
26    }
27}