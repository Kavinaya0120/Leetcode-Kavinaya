// Last updated: 8/12/2026, 11:39:40 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray())
            result ^= c;

        for (char c : t.toCharArray())
            result ^= c;

        return (char) result;
    }
}