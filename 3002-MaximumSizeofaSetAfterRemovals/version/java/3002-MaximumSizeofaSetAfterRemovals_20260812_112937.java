// Last updated: 8/12/2026, 11:29:37 AM
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        int n = nums1.length;
6
7        Set<Integer> set1 = new HashSet<>();
8        Set<Integer> set2 = new HashSet<>();
9
10        for (int x : nums1) {
11            set1.add(x);
12        }
13
14        for (int x : nums2) {
15            set2.add(x);
16        }
17
18        int common = 0;
19
20        for (int x : set1) {
21            if (set2.contains(x)) {
22                common++;
23            }
24        }
25
26        int unique1 = set1.size() - common;
27        int unique2 = set2.size() - common;
28
29        int take1 = Math.min(n / 2, unique1);
30        int take2 = Math.min(n / 2, unique2);
31
32        int remaining = n - take1 - take2;
33
34        int result = take1 + take2 + Math.min(remaining, common);
35
36        return result;
37    }
38}