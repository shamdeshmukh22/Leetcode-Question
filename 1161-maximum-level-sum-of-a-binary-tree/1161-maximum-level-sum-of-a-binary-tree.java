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
    HashMap<Integer,Long>map=new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        long max=Integer.MIN_VALUE;
        int level=0;
        CountTotalSum(root,1);
       for(var entry:map.entrySet()){
            long val=entry.getValue();
              if(val>=max){
                if(max==val){
                    level=Math.min(level,entry.getKey());
                }
                else level=entry.getKey();
                max=val;
              }
       }
    return level;
   }
   public void CountTotalSum(TreeNode root,int level){
    if(root==null ) return;
    CountTotalSum(root.left,level+1);
    map.put(level,map.getOrDefault(level,0l)+root.val);
    CountTotalSum(root.right,level+1);
   }
}