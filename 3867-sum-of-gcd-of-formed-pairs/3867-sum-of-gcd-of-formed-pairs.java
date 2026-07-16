class Solution {
    public int FindGcd(int a,int b){
        if(a==0) return b;
        return FindGcd(b%a,a);
    }
    public long gcdSum(int[] nums) {
        long totalSum=0;
        int max=nums[0],i=0,j=nums.length-1;
        for( i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            nums[i]=FindGcd(nums[i],max);
        }
        i=0;
        Arrays.sort(nums);
        while(i<j){
            totalSum+=FindGcd(nums[i],nums[j]);
            i++;j--;
        }
        return totalSum;
    }
}