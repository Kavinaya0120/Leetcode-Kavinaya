// Last updated: 8/12/2026, 11:39:11 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c))
                upper++;
        }

        return upper == 0 ||
               upper == word.length() ||
               (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }
}