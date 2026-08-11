// Last updated: 8/11/2026, 2:14:10 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        int used = 0;

        while (mainTank > 0) {
            // use 1 liter
            mainTank--;
            used++;
            distance += 10;

            // after every 5 liters USED, add 1 liter if possible
            if (used % 5 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }

        return distance;
    }
}

