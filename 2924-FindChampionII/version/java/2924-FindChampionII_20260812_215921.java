// Last updated: 8/12/2026, 9:59:21 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] indegree = new int[n];
4
5        for (int[] edge : edges) {
6            indegree[edge[1]]++;
7        }
8
9        int champion = -1;
10        int count = 0;
11
12        for (int i = 0; i < n; i++) {
13            if (indegree[i] == 0) {
14                champion = i;
15                count++;
16            }
17        }
18
19        return count == 1 ? champion : -1;
20    }
21}