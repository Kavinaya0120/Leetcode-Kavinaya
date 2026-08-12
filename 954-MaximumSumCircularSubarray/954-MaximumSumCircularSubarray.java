// Last updated: 8/12/2026, 11:52:44 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {

            // Maximum subarray sum
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            total += num;
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular maximum
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}