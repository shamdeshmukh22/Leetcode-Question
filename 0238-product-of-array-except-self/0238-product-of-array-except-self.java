class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1,zero=0;
        for(int i:nums){
            if(i==0) zero++;
            else product*=i;
            if(zero>=2){
                Arrays.fill(nums,0);
                return nums;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=product;
            else if(zero==0) nums[i]=product/nums[i];
            else if(zero==1) nums[i]=0;
        }
        return nums;
    }
}