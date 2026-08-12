// Last updated: 8/12/2026, 11:36:34 PM
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];

        for (int[] edge : edges) {
            indegree[edge[1]]++;
        }

        int champion = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                champion = i;
                count++;
            }
        }

        return count == 1 ? champion : -1;
    }
}