// Last updated: 8/12/2026, 11:45:32 AM
1class Solution {
2    public int minDepth(TreeNode root) {
3
4        if (root == null)
5            return 0;
6
7        if (root.left == null)
8            return minDepth(root.right) + 1;
9
10        if (root.right == null)
11            return minDepth(root.left) + 1;
12
13        return Math.min(
14            minDepth(root.left),
15            minDepth(root.right)
16        ) + 1;
17    }
18}