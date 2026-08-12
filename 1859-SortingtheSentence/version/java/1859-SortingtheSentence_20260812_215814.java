// Last updated: 8/12/2026, 9:58:14 PM
1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] result = new String[words.length];
5
6        for (String word : words) {
7            int index = word.charAt(word.length() - 1) - '1';
8
9            result[index] =
10                word.substring(0, word.length() - 1);
11        }
12
13        return String.join(" ", result);
14    }
15}