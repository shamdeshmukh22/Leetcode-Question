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
    public int countNodes(TreeNode root){
         if(root==null) return 0;
         int left=countNodes(root.left),right=countNodes(root.right);
        if(root.val>= Math.max(left,right))
              count++;
          return  Math.max(root.val, Math.max(left, right)); 
    }
    public int countDominantNodes(TreeNode root) {
        int a=countNodes(root);
        return count;
    }
}