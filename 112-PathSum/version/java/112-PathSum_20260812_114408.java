// Last updated: 8/12/2026, 11:44:08 AM
1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3
4        if (root == null)
5            return false;
6
7        if (root.left == null && root.right == null)
8            return targetSum == root.val;
9
10        return hasPathSum(root.left, targetSum - root.val)
11            || hasPathSum(root.right, targetSum - root.val);
12    }
13}