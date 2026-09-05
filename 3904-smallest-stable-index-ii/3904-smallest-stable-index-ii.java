class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n*2];
        int max=nums[0],min=nums[n-1];
         
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=max;

            min=Math.min(min,nums[n-i-1]);
            arr[arr.length-1-i]=min;
        }   

        for(int i=0;i<nums.length;i++){
            int score=arr[i]-arr[i+n];
            if(score<=k) return i;
        }

        return -1;
    }
}