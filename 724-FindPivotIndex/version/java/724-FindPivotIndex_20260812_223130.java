// Last updated: 8/12/2026, 10:31:30 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3
4        int total = 0;
5
6        for (int num : nums)
7            total += num;
8
9        int leftSum = 0;
10
11        for (int i = 0; i < nums.length; i++) {
12
13            int rightSum = total - leftSum - nums[i];
14
15            if (leftSum == rightSum)
16                return i;
17
18            leftSum += nums[i];
19        }
20
21        return -1;
22    }
23}