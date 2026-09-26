class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int add=nums[0]+nums[1];
        set.add(add);
        for(int i=2;i<nums.length;i++){
            add-=nums[i-2];
            add+=nums[i];
            if(set.contains(add))return true;
            set.add(add);
        }
        return false;
    }
}