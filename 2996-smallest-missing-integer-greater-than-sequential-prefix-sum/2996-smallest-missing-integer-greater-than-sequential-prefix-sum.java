class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1) return nums[0]+1;

        HashSet<Integer>set=new HashSet<>();
        int count=nums[0];
         for(int i:nums)
         set.add(i);
        for(int i=1;i<nums.length;i++){
             if(nums[i]==nums[i-1]+1){
                count+=nums[i];
             }
             else { break; }
        }
        for(int i=count;;i++){
            if(!set.contains(i)) return i;
        }
        // return max;
    }
}