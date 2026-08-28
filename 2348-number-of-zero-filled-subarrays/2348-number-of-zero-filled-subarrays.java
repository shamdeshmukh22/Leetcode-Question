class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int i=0;
        while(i<nums.length){
            int j=i;

            while(j<nums.length && nums[j]==0){
                j++;
            }

            if(i!=j){
                long diff=j-i;
                count+=(diff*(diff+1))/2;
                //System.out.println(diff);
                i=j;
            }
            i++;
        }
        return count;
    }
}