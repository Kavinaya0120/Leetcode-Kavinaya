// Last updated: 8/12/2026, 11:29:23 AM
1class Solution {
2    public int countNodes(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6
7        int leftHeight = getHeight(root.left);
8        int rightHeight = getHeight(root.right);
9
10        if (leftHeight == rightHeight) {
11            return (1 << leftHeight) + countNodes(root.right);
12        } else {
13            return (1 << rightHeight) + countNodes(root.left);
14        }
15    }
16
17    private int getHeight(TreeNode node) {
18        int height = 0;
19
20        while (node != null) {
21            height++;
22            node = node.left;
23        }
24
25        return height;
26    }
27}