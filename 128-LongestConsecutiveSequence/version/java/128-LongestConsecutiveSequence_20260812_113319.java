// Last updated: 8/12/2026, 11:33:19 AM
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5
6        Set<Integer> set = new HashSet<>();
7
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int longest = 0;
13
14        for (int num : set) {
15
16            // Start of sequence
17            if (!set.contains(num - 1)) {
18
19                int current = num;
20                int length = 1;
21
22                while (set.contains(current + 1)) {
23                    current++;
24                    length++;
25                }
26
27                longest = Math.max(longest, length);
28            }
29        }
30
31        return longest;
32    }
33}