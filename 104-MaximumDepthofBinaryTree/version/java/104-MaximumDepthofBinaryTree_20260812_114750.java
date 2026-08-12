// Last updated: 8/12/2026, 11:47:50 AM
1class Solution {
2    public int maxDepth(TreeNode root) {
3
4        if (root == null)
5            return 0;
6
7        return 1 + Math.max(
8            maxDepth(root.left),
9            maxDepth(root.right)
10        );
11    }
12}