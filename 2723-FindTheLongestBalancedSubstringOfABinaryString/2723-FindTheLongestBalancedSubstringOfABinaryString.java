// Last updated: 8/12/2026, 11:36:45 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;

                if (i > 0 && s.charAt(i - 1) == '0') {
                    // Start of a group of 1s
                }

                max = Math.max(max, 2 * Math.min(zeros, ones));

                if (i + 1 < s.length() &&
                    s.charAt(i + 1) == '0') {
                    zeros = 0;
                    ones = 0;
                }
            }
        }

        return max;
    }
}