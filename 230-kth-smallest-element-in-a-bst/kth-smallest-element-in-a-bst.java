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
class Solution {
    
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
    if (root == null) {
        return -1;
    }
    
    // Traverse the left subtree
    kthSmallest(root.left, k);
    
    // Process the current node
    count++;
    if (count == k) {
        result = root.val;
        return result; // Found the k-th smallest element, return it
    }
    
    // If k-th smallest element is not found yet, traverse the right subtree
    kthSmallest(root.right, k);
    
    return result;
}
}