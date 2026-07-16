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
    public void FindRouteAndAsList(TreeNode root,List<List<Integer>>list,ArrayList<Integer>sub,int curr,int target){
        if(root==null) return;
        curr+=root.val;
        sub.add(root.val);
        if(root.left==null && root.right==null && curr==target){
              list.add(new ArrayList<>(sub));
        }
        FindRouteAndAsList(root.left,list,sub,curr,target);
        FindRouteAndAsList(root.right,list,sub,curr,target);
          sub.remove(sub.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
         FindRouteAndAsList(root,list,new ArrayList<>(),0,targetSum);
         return list;
    }
}