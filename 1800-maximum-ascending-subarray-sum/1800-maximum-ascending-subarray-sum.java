class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0,sum=nums[0],i=1;
        while(i<nums.length){
              while(i<nums.length && nums[i]>nums[i-1]){
                sum+=nums[i];
                i++;
              }
                max=Math.max(sum,max);
               if(i<nums.length) sum=nums[i];
              i++;
        }
        return Math.max(sum,max);
    }
}