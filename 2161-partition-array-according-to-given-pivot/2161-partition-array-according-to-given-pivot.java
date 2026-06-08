class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int copy[]=nums.clone();
       int i=0,j=nums.length-1,k=0;
       while(i<=j){
        if(copy[i]<pivot){
            nums[k]=copy[i];
            k++;
        }
        i++;
       }
       i=j;
       while(j>=0){
         if(copy[j]>pivot){
            nums[i]=copy[j];
            i--;
        }
        j--;
       }
       while(k<=i){
        nums[k]=pivot;
        k++;
       }
       return nums; 
    }
}