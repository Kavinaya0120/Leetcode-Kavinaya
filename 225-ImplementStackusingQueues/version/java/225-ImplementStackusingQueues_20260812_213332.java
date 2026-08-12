// Last updated: 8/12/2026, 9:33:32 PM
1class MyStack {
2    Queue<Integer> q = new LinkedList<>();
3
4    public MyStack() {
5    }
6
7    public void push(int x) {
8        q.add(x);
9
10        int size = q.size();
11
12        for (int i = 0; i < size - 1; i++) {
13            q.add(q.remove());
14        }
15    }
16
17    public int pop() {
18        return q.remove();
19    }
20
21    public int top() {
22        return q.peek();
23    }
24
25    public boolean empty() {
26        return q.isEmpty();
27    }
28}