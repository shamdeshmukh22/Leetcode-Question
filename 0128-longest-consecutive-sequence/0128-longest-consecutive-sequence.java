class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)set.add(i);
         int max=0;
         for(int i:set){
            if(! set.contains(i-1)){
            int curr=1,val=i;
               while(set.contains(val+1)){
                    curr++;
                    val++;
               }
               max=Math.max(max,curr);
               }
         }
        return max;
    }
}