class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prev=0,tot=0;
        for(int i:nums)tot+=i;

        for(int i=0;i<nums.length;i++){
            tot-=nums[i];
            int temp=nums[i];
            nums[i]=Math.abs(tot-prev);
            prev+=temp;
        }
        return nums;
    }
}