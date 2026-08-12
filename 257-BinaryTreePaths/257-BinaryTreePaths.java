// Last updated: 8/12/2026, 11:53:50 AM
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode root, String path,
                     List<String> result) {

        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            result.add(path + root.val);
            return;
        }

        path += root.val + "->";

        dfs(root.left, path, result);
        dfs(root.right, path, result);
    }
}