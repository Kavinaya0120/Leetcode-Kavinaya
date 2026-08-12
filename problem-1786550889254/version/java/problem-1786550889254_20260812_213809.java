// Last updated: 8/12/2026, 9:38:09 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr = s.toCharArray();
4
5        int left = 0;
6        int right = arr.length - 1;
7
8        while (left < right) {
9            while (left < right && !isVowel(arr[left]))
10                left++;
11
12            while (left < right && !isVowel(arr[right]))
13                right--;
14
15            char temp = arr[left];
16            arr[left] = arr[right];
17            arr[right] = temp;
18
19            left++;
20            right--;
21        }
22
23        return new String(arr);
24    }
25
26    private boolean isVowel(char c) {
27        return "aeiouAEIOU".indexOf(c) != -1;
28    }
29}