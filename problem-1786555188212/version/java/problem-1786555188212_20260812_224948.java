// Last updated: 8/12/2026, 10:49:48 PM
1import java.util.*;
2
3class MinStack {
4
5    Stack<Integer> stack;
6    Stack<Integer> minStack;
7
8    public MinStack() {
9        stack = new Stack<>();
10        minStack = new Stack<>();
11    }
12
13    public void push(int val) {
14
15        stack.push(val);
16
17        if (minStack.isEmpty() ||
18            val <= minStack.peek()) {
19
20            minStack.push(val);
21        }
22    }
23
24    public void pop() {
25
26        if (stack.peek().equals(minStack.peek())) {
27            minStack.pop();
28        }
29
30        stack.pop();
31    }
32
33    public int top() {
34        return stack.peek();
35    }
36
37    public int getMin() {
38        return minStack.peek();
39    }
40}