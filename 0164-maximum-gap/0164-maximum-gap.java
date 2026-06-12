class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);

        if(nums.length==1)return 0;
        int diff=0;
        for(int i=1;i<nums.length;i++){
            diff=Math.max(diff,Math.abs(nums[i]-nums[i-1]));
        }
        return diff;
    }
}