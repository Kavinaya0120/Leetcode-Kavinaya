// Last updated: 8/12/2026, 11:38:48 PM
import java.util.*;

class Solution {
    public boolean judgePoint24(int[] cards) {

        List<Double> nums = new ArrayList<>();

        for (int card : cards)
            nums.add((double) card);

        return solve(nums);
    }

    private boolean solve(List<Double> nums) {

        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24) < 1e-6;
        }

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

                List<Double> remaining = new ArrayList<>();

                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j)
                        remaining.add(nums.get(k));
                }

                double a = nums.get(i);
                double b = nums.get(j);

                List<Double> values = new ArrayList<>();

                values.add(a + b);
                values.add(a - b);
                values.add(b - a);
                values.add(a * b);

                if (Math.abs(b) > 1e-6)
                    values.add(a / b);

                if (Math.abs(a) > 1e-6)
                    values.add(b / a);

                for (double value : values) {
                    remaining.add(value);

                    if (solve(remaining))
                        return true;

                    remaining.remove(remaining.size() - 1);
                }
            }
        }

        return false;
    }
}