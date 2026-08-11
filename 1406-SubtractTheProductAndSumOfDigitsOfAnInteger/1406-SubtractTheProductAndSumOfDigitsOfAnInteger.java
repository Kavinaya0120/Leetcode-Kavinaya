// Last updated: 8/11/2026, 2:15:09 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0,product=1;
        while(temp>0) {
            int num=temp%10;
            sum+=num;
            product*=num;
            temp/=10;
        }
        return product-sum;
    }
}