/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or we find either p or q, return root
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for p and q in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right return non-null, the current node is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null result from left or right
        return (left != null) ? left : right;
    }
}