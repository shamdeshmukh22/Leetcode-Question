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
    public int cdn(TreeNode root){
        if(root==null) return 0;
        int left=cdn(root.left),right=cdn(root.right);
        int max=Math.max(left,right);
        if(root.val>=max ) count++;
        return Math.max(root.val,max);
    }
    public int countDominantNodes(TreeNode root) {
       int a=cdn(root);
       return count;
    }
}