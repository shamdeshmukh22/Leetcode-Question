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
    public long kthLargestLevelSum(TreeNode root, int k) {
        // long KthSum=0;
        countSum(root,0);
        List<Long> list = new ArrayList<>();
         map.forEach((key,value)->list.add(value));

        if(list.size()<k) return -1;
        Collections.sort(list);
        return list.get(list.size()-k);
    }
    public void countSum(TreeNode root,int level){
        if(root==null) return;
        countSum(root.left,level+1);
        map.put(level,map.getOrDefault(level,0L)+root.val);
        countSum(root.right,level+1);
    }
}