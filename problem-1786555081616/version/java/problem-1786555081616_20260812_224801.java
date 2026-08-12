// Last updated: 8/12/2026, 10:48:01 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        int[] a = nums1;
5        int[] b = nums2;
6
7        if (a.length > b.length) {
8            a = nums2;
9            b = nums1;
10        }
11
12        int m = a.length;
13        int n = b.length;
14
15        int left = 0;
16        int right = m;
17
18        while (left <= right) {
19
20            int cutA = (left + right) / 2;
21            int cutB = (m + n + 1) / 2 - cutA;
22
23            int leftA = cutA == 0 ?
24                    Integer.MIN_VALUE : a[cutA - 1];
25
26            int rightA = cutA == m ?
27                    Integer.MAX_VALUE : a[cutA];
28
29            int leftB = cutB == 0 ?
30                    Integer.MIN_VALUE : b[cutB - 1];
31
32            int rightB = cutB == n ?
33                    Integer.MAX_VALUE : b[cutB];
34
35            if (leftA <= rightB && leftB <= rightA) {
36
37                if ((m + n) % 2 == 0) {
38                    return (Math.max(leftA, leftB)
39                           + Math.min(rightA, rightB)) / 2.0;
40                } else {
41                    return Math.max(leftA, leftB);
42                }
43            }
44
45            if (leftA > rightB)
46                right = cutA - 1;
47            else
48                left = cutA + 1;
49        }
50
51        return 0.0;
52    }
53}