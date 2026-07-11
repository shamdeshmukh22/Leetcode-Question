class Solution {
    public void wiggleSort(int[] nums) {
        int copy[]=nums.clone();
        Arrays.sort(copy);
        int n=nums.length-1;
        int i=(n)/2,j=n,k=0;
        while(k<=n){
                if(k%2==0){
                    nums[k++]=copy[i--];
                }
                else
                 nums[k++]=copy[j--];
        }
    }
}