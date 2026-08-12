// Last updated: 8/12/2026, 10:14:50 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3
4        int even = 0;
5        int odd = 1;
6
7        while (even < nums.length && odd < nums.length) {
8
9            if (nums[even] % 2 == 0) {
10                even += 2;
11            }
12            else if (nums[odd] % 2 == 1) {
13                odd += 2;
14            }
15            else {
16                int temp = nums[even];
17                nums[even] = nums[odd];
18                nums[odd] = temp;
19
20                even += 2;
21                odd += 2;
22            }
23        }
24
25        return nums;
26    }
27}