/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 //* Resursive:
class Solution {
    private List<Integer> result = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return result;
    }

    private void traverse(TreeNode root){
        if(root == null) return;

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
    }
}