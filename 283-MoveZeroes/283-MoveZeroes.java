// Last updated: 8/11/2026, 2:16:30 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        // move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // fill remaining with zeroes
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
