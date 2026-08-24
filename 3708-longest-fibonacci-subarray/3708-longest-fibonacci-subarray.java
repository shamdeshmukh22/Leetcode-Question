class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<=2) return nums.length;

        int count=2,max=0,i=2;
        
        while(i<nums.length){
             if(nums[i-2]+nums[i-1]==nums[i]){
                count++;
             }
             else{
                 max=Math.max(count,max);
                 count=2;
             }
             i++;
        }
        
        return Math.max(count,max);
    }
}