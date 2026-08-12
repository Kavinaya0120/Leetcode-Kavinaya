// Last updated: 8/12/2026, 10:31:03 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> majorityElement(int[] nums) {
5
6        List<Integer> result = new ArrayList<>();
7
8        int candidate1 = 0;
9        int candidate2 = 1;
10
11        int count1 = 0;
12        int count2 = 0;
13
14        for (int num : nums) {
15
16            if (num == candidate1) {
17                count1++;
18            }
19            else if (num == candidate2) {
20                count2++;
21            }
22            else if (count1 == 0) {
23                candidate1 = num;
24                count1 = 1;
25            }
26            else if (count2 == 0) {
27                candidate2 = num;
28                count2 = 1;
29            }
30            else {
31                count1--;
32                count2--;
33            }
34        }
35
36        count1 = 0;
37        count2 = 0;
38
39        for (int num : nums) {
40            if (num == candidate1)
41                count1++;
42
43            if (num == candidate2)
44                count2++;
45        }
46
47        if (count1 > nums.length / 3)
48            result.add(candidate1);
49
50        if (candidate2 != candidate1 &&
51            count2 > nums.length / 3)
52            result.add(candidate2);
53
54        return result;
55    }
56}