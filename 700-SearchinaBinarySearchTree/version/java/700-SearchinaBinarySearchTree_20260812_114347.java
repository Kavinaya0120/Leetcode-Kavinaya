// Last updated: 8/12/2026, 11:43:47 AM
1class Solution {
2    public TreeNode searchBST(TreeNode root, int val) {
3
4        while (root != null) {
5
6            if (root.val == val)
7                return root;
8
9            if (val < root.val)
10                root = root.left;
11            else
12                root = root.right;
13        }
14
15        return null;
16    }
17}