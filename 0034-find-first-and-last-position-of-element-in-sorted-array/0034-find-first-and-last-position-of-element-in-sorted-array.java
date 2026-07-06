class Solution {
    public int[] searchRange(int[] nums, int target) {
    //   int arr[]=new int{-1,-1};
      int high=nums.length-1,low=0,mid=0;
      while(low<=high){
         mid=(high+low)/2;
         if(nums[mid]==target){
            int i=mid,j=mid;
            while(i>0 && nums[i-1]==target){
                i--;
            }
             while(j<nums.length-1 && nums[j+1]==target){
                j++;
            }
            return new int[] {i,j};
         }
         else if(nums[mid]<target){
            low=mid+1;
         }
         else high=mid-1;
      } 
      return new int[]{-1,-1}; 
    }
}