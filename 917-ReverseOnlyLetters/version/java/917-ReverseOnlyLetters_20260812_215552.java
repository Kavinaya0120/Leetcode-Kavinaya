// Last updated: 8/12/2026, 9:55:52 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4
5        int left = 0;
6        int right = arr.length - 1;
7
8        while (left < right) {
9
10            while (left < right && !Character.isLetter(arr[left]))
11                left++;
12
13            while (left < right && !Character.isLetter(arr[right]))
14                right--;
15
16            char temp = arr[left];
17            arr[left] = arr[right];
18            arr[right] = temp;
19
20            left++;
21            right--;
22        }
23
24        return new String(arr);
25    }
26}