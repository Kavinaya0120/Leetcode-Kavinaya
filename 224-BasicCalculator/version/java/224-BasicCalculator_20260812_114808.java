// Last updated: 8/12/2026, 11:48:08 AM
1class Solution {
2    public int calculate(String s) {
3
4        int result = 0;
5        int number = 0;
6        int sign = 1;
7
8        java.util.Stack<Integer> stack = new java.util.Stack<>();
9
10        for (int i = 0; i < s.length(); i++) {
11
12            char c = s.charAt(i);
13
14            if (Character.isDigit(c)) {
15                number = number * 10 + (c - '0');
16            }
17
18            else if (c == '+') {
19                result += sign * number;
20                number = 0;
21                sign = 1;
22            }
23
24            else if (c == '-') {
25                result += sign * number;
26                number = 0;
27                sign = -1;
28            }
29
30            else if (c == '(') {
31                stack.push(result);
32                stack.push(sign);
33
34                result = 0;
35                sign = 1;
36            }
37
38            else if (c == ')') {
39                result += sign * number;
40                number = 0;
41
42                result *= stack.pop();
43                result += stack.pop();
44            }
45        }
46
47        result += sign * number;
48
49        return result;
50    }
51}