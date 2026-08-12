// Last updated: 8/12/2026, 10:45:14 PM
1import java.util.*;
2
3class Solution {
4    public boolean judgePoint24(int[] cards) {
5
6        List<Double> nums = new ArrayList<>();
7
8        for (int card : cards)
9            nums.add((double) card);
10
11        return solve(nums);
12    }
13
14    private boolean solve(List<Double> nums) {
15
16        if (nums.size() == 1) {
17            return Math.abs(nums.get(0) - 24) < 1e-6;
18        }
19
20        for (int i = 0; i < nums.size(); i++) {
21            for (int j = i + 1; j < nums.size(); j++) {
22
23                List<Double> remaining = new ArrayList<>();
24
25                for (int k = 0; k < nums.size(); k++) {
26                    if (k != i && k != j)
27                        remaining.add(nums.get(k));
28                }
29
30                double a = nums.get(i);
31                double b = nums.get(j);
32
33                List<Double> values = new ArrayList<>();
34
35                values.add(a + b);
36                values.add(a - b);
37                values.add(b - a);
38                values.add(a * b);
39
40                if (Math.abs(b) > 1e-6)
41                    values.add(a / b);
42
43                if (Math.abs(a) > 1e-6)
44                    values.add(b / a);
45
46                for (double value : values) {
47                    remaining.add(value);
48
49                    if (solve(remaining))
50                        return true;
51
52                    remaining.remove(remaining.size() - 1);
53                }
54            }
55        }
56
57        return false;
58    }
59}