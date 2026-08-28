class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int i=0,count=0;

        while(i<nums.length-1){
            int diff=nums[i+1]-nums[i];
            int j=i;

            while(j<nums.length-1 && nums[j+1]-nums[j]==diff){
                j++;
            }
            int size=j-i+1;
            if(size>2){
                size-=2;
                count+=(size*(size+1))/2;
                i=j-1;
            }
            i++;
        }

        return count;
    }
}