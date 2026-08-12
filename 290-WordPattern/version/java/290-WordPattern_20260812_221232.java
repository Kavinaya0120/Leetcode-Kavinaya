// Last updated: 8/12/2026, 10:12:32 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6
7        if (pattern.length() != words.length)
8            return false;
9
10        HashMap<Character, String> map1 = new HashMap<>();
11        HashMap<String, Character> map2 = new HashMap<>();
12
13        for (int i = 0; i < pattern.length(); i++) {
14            char c = pattern.charAt(i);
15            String word = words[i];
16
17            if (map1.containsKey(c) &&
18                !map1.get(c).equals(word))
19                return false;
20
21            if (map2.containsKey(word) &&
22                map2.get(word) != c)
23                return false;
24
25            map1.put(c, word);
26            map2.put(word, c);
27        }
28
29        return true;
30    }
31}