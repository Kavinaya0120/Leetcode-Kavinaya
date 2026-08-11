// Last updated: 8/11/2026, 2:13:38 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n = prices.length;
        int m = discounts.length;
        long total = 0;
        for(int price:prices){
            total+=(long)price*100;
        }
        int k=Math.min(n,m);
        for(int i=0;i<k;i++){
            int price=prices[n-1-i];
            int discount=discounts[m-1-i];
            total-=(long)price*discount;
        }
        return total/100.0;
    }
}