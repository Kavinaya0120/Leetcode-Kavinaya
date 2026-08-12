// Last updated: 8/12/2026, 11:36:39 PM
import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long MOD = 1000000007L;

        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R')
                pos[i] = (long) nums[i] + d;
            else
                pos[i] = (long) nums[i] - d;
        }

        Arrays.sort(pos);

        long answer = 0;
        long prefix = 0;

        for (int i = 0; i < n; i++) {
            answer = (answer + pos[i] * i - prefix) % MOD;
            prefix = (prefix + pos[i]) % MOD;
        }

        return (int) answer;
    }
}