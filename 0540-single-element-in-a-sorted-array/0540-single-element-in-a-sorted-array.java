class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=0;
 if(nums.length==1) return nums[0];
        while(i<nums.length){
             if(nums[i]!=nums[j]){
                if(i-j==1)return nums[j];
                j=i;
             }
             i++;
        }
        return nums[j];
    }
}