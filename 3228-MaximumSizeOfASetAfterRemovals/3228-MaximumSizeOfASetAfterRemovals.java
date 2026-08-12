// Last updated: 8/12/2026, 11:51:57 AM
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        int common = 0;

        for (int x : set1) {
            if (set2.contains(x)) {
                common++;
            }
        }

        int unique1 = set1.size() - common;
        int unique2 = set2.size() - common;

        int take1 = Math.min(n / 2, unique1);
        int take2 = Math.min(n / 2, unique2);

        int remaining = n - take1 - take2;

        int result = take1 + take2 + Math.min(remaining, common);

        return result;
    }
}