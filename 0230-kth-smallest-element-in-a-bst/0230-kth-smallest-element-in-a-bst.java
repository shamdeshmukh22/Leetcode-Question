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
    int visited=0,ans=0;
    public int kthSmallest(TreeNode root, int k) {
        TravelTree(root,k);
        return ans;
    }
    public void TravelTree(TreeNode root,int k){
        if(root==null) return ;
        TravelTree(root.left,k);
        visited++;
        if(visited==k){
            ans=root.val;
            return;
        }
        TravelTree(root.right,k);
    }
}