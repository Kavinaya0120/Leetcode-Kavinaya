// Last updated: 8/12/2026, 11:53:07 AM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {

            if (root.val == val)
                return root;

            if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return null;
    }
}