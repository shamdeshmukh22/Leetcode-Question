class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=1) return n;
         
         int min=nums[0],max=nums[0];
         int minIndex=0,maxIndex=0;

        for(int i=1;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                    maxIndex=i;
                }
                if(nums[i]<min){
                    min=nums[i];
                    minIndex=i;
                }
        }

        int disMin=Math.min(minIndex+1, n-minIndex);
        int disMax=Math.min(maxIndex+1, n-maxIndex);

        return Math.min(disMin+disMax,
            Math.min(
                Math.max(minIndex+1,maxIndex+1),
                Math.max(n-minIndex,n-maxIndex)
            )
         );
    }
}