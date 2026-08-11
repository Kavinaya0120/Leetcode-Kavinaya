// Last updated: 8/11/2026, 2:15:35 PM
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int max = 0;

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int prev = arr[j] - arr[i];
                if (map.containsKey(prev)) {
                    int k = map.get(prev);
                    if (k < i) {
                        dp[i][j] = dp[k][i] + 1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
        }

        return max == 0 ? 0 : max + 2;
    }
}
