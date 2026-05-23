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
    int count=0;
    public void countNodesTree(TreeNode root){
        if(root==null)return;
        count++;
         countNodesTree(root.left);
         countNodesTree(root.right);
    }
    public int countNodes(TreeNode root) {
         countNodesTree(root);
         return count;
    }
}