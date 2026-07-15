class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int copy[]=new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            int sum=(nums[i-1]+nums[i])%10;
            copy[i-1]=sum;
        }
        return triangularSum(copy);
    }
}