// Last updated: 8/12/2026, 10:06:22 PM
1import java.util.*;
2
3class Solution {
4    public boolean checkIfExist(int[] arr) {
5
6        HashSet<Integer> set = new HashSet<>();
7
8        for (int num : arr) {
9
10            if (set.contains(2 * num))
11                return true;
12
13            if (num % 2 == 0 && set.contains(num / 2))
14                return true;
15
16            set.add(num);
17        }
18
19        return false;
20    }
21}