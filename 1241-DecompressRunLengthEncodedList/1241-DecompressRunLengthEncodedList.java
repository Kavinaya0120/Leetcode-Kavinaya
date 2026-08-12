// Last updated: 8/12/2026, 11:37:55 PM
import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {

            int frequency = nums[i];
            int value = nums[i + 1];

            for (int j = 0; j < frequency; j++) {
                list.add(value);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}