// Last updated: 8/11/2026, 2:17:20 PM
class Solution {
    public int trailingZeroes(int n) {
         int count = 0;
        while (n > 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }
}