// Last updated: 8/12/2026, 10:16:33 PM
1import java.util.*;
2
3class Solution {
4    public int[] decompressRLElist(int[] nums) {
5
6        ArrayList<Integer> list = new ArrayList<>();
7
8        for (int i = 0; i < nums.length; i += 2) {
9
10            int frequency = nums[i];
11            int value = nums[i + 1];
12
13            for (int j = 0; j < frequency; j++) {
14                list.add(value);
15            }
16        }
17
18        int[] result = new int[list.size()];
19
20        for (int i = 0; i < list.size(); i++) {
21            result[i] = list.get(i);
22        }
23
24        return result;
25    }
26}