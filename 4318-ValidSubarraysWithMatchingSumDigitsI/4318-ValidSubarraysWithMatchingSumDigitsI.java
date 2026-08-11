// Last updated: 8/11/2026, 2:13:54 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n =nums.length;
        int count=0;
        for(int l=0;l<n;l++){
            long sum =0;
            for(int r=l;r<n;r++){
                sum+=nums[r];
                if(sum<=0) continue;
                long lastDigit =sum%10;
                long temp=sum;
                while(temp>=10){
                    temp/=10;
                }
                long firstDigit = temp;
                if(firstDigit == x && lastDigit == x){
                    count++;
                }
            }
        }
        return count;
    }
}