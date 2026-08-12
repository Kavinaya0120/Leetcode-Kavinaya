// Last updated: 8/12/2026, 11:39:23 PM
import java.util.*;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2,
                            int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        for (int c : nums3) {
            for (int d : nums4) {
                count += map.getOrDefault(-(c + d), 0);
            }
        }

        return count;
    }
}