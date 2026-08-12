// Last updated: 8/12/2026, 10:43:16 PM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for (int num : nums) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11
12        PriorityQueue<Integer> pq =
13            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
14
15        for (int num : map.keySet()) {
16            pq.offer(num);
17
18            if (pq.size() > k)
19                pq.poll();
20        }
21
22        int[] result = new int[k];
23
24        for (int i = k - 1; i >= 0; i--) {
25            result[i] = pq.poll();
26        }
27
28        return result;
29    }
30}