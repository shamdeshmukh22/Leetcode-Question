class Solution {
    public void sortColors(int[] nums) {
     int i=0,k=0,l=nums.length-1,one=0;
     int arr[]=nums.clone();
     while(i<arr.length){
        if(arr[i]==0){
            nums[k++]=0;
        }
        else if(arr[i]==2){
            nums[l--]=2;
        }
        else one++;
       i++;
     }
     while(one>0){
        nums[k++]=1;
        one--;
     }
    }
}