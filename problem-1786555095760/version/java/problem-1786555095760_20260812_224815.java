// Last updated: 8/12/2026, 10:48:15 PM
1import java.util.*;
2
3class Solution {
4    public Node copyRandomList(Node head) {
5
6        if (head == null)
7            return null;
8
9        HashMap<Node, Node> map = new HashMap<>();
10
11        Node current = head;
12
13        while (current != null) {
14            map.put(current, new Node(current.val));
15            current = current.next;
16        }
17
18        current = head;
19
20        while (current != null) {
21
22            Node copy = map.get(current);
23
24            copy.next = map.get(current.next);
25            copy.random = map.get(current.random);
26
27            current = current.next;
28        }
29
30        return map.get(head);
31    }
32}