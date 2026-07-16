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
    public int MaxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(MaxDepth(root.left),MaxDepth(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int c=Math.abs(MaxDepth(root.left)-MaxDepth(root.right));
        return (c<2 &&  isBalanced(root.left) && isBalanced(root.right));
    }
}