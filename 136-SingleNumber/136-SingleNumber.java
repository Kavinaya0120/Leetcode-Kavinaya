// Last updated: 8/11/2026, 2:17:42 PM
class Solution {
    public int singleNumber(int[] nums) {
         int x=0,n,i;
        n=nums.length;
        for(i=0;i<n;i++) {
           x = x^nums[i];

        }
        return x;
    }
}

