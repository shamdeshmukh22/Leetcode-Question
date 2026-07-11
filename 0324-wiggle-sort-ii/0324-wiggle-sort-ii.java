class Solution {
    public void wiggleSort(int[] nums) {
        int copy[]=nums.clone();
        Arrays.sort(copy);
        int i=(nums.length-1)/2,j=nums.length-1,k=0;
        while(k<nums.length){
                if(k%2==0){
                    nums[k++]=copy[i--];
                }
                else
                 nums[k++]=copy[j--];
        }
    }
}