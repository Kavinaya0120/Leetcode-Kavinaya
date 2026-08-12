// Last updated: 8/12/2026, 11:37:01 PM
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }

        return count;
    }
}