// Last updated: 8/12/2026, 11:44:29 AM
1import java.util.*;
2
3class Solution {
4    public List<String> binaryTreePaths(TreeNode root) {
5
6        List<String> result = new ArrayList<>();
7
8        dfs(root, "", result);
9
10        return result;
11    }
12
13    private void dfs(TreeNode root, String path,
14                     List<String> result) {
15
16        if (root == null)
17            return;
18
19        if (root.left == null && root.right == null) {
20            result.add(path + root.val);
21            return;
22        }
23
24        path += root.val + "->";
25
26        dfs(root.left, path, result);
27        dfs(root.right, path, result);
28    }
29}