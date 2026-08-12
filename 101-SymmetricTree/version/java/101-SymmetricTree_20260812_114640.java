// Last updated: 8/12/2026, 11:46:40 AM
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3
4        if (root == null)
5            return true;
6
7        return check(root.left, root.right);
8    }
9
10    private boolean check(TreeNode left, TreeNode right) {
11
12        if (left == null && right == null)
13            return true;
14
15        if (left == null || right == null)
16            return false;
17
18        if (left.val != right.val)
19            return false;
20
21        return check(left.left, right.right)
22            && check(left.right, right.left);
23    }
24}