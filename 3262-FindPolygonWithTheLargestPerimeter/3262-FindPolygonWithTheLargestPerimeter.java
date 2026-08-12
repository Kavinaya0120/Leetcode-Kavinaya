// Last updated: 8/12/2026, 11:36:22 PM
import java.util.*;

class Solution {
    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        long sum = 0;
        long ans = -1;

        for (int i = 0; i < nums.length; i++) {

            if (i >= 2 && sum > nums[i]) {
                ans = sum + nums[i];
            }

            sum += nums[i];
        }

        return ans;
    }
}