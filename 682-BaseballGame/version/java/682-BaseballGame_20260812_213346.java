// Last updated: 8/12/2026, 9:33:46 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (String op : operations) {
6            if (op.equals("+")) {
7                int a = stack.pop();
8                int b = stack.peek();
9
10                stack.push(a);
11                stack.push(a + b);
12            }
13            else if (op.equals("D")) {
14                stack.push(2 * stack.peek());
15            }
16            else if (op.equals("C")) {
17                stack.pop();
18            }
19            else {
20                stack.push(Integer.parseInt(op));
21            }
22        }
23
24        int sum = 0;
25
26        for (int x : stack)
27            sum += x;
28
29        return sum;
30    }
31}