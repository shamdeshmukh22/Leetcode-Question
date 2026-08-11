class Solution {
    public int missingInteger(int[] nums) {
      HashSet<Integer>set=new HashSet<>();

      for(int n:nums){
        set.add(n);
      }

      int i=1,count=nums[0];
      while(i<nums.length && nums[i]==nums[i-1]+1){
        count+=nums[i];
         i++;
      }

      while(set.contains(count)){
         count++;
      }
        return count;
    }
}