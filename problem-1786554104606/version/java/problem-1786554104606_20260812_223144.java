// Last updated: 8/12/2026, 10:31:44 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5
6        List<Integer> result = new ArrayList<>();
7
8        for (int num : nums) {
9
10            int index = Math.abs(num) - 1;
11
12            if (nums[index] > 0) {
13                nums[index] = -nums[index];
14            }
15        }
16
17        for (int i = 0; i < nums.length; i++) {
18
19            if (nums[i] > 0) {
20                result.add(i + 1);
21            }
22        }
23
24        return result;
25    }
26}