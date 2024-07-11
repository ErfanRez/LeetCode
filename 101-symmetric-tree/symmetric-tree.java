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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);
        
    }

    public boolean isMirror(TreeNode left, TreeNode right){

        if(left == null || right == null){
            return left == right; //returns true if both were null otherwise false
        }

        boolean check1 = isMirror(left.left, right.right);
        boolean check2 = isMirror(left.right, right.left);

        return (left.val == right.val) && check1 && check2;

    }
}

//Using DFS