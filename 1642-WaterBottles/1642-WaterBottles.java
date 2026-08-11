// Last updated: 8/11/2026, 2:15:01 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int empty = 0;

        while (numBottles > 0) {
            // drink all full bottles
            total += numBottles;
            empty += numBottles;

            // exchange empty bottles for new full bottles
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        return total;
    }
}
