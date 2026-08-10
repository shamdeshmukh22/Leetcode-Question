class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min=nums[0],max=nums[0];
       HashSet<Integer>set=new HashSet<>();
      List<Integer>list=new ArrayList<>();

       for(int n:nums){
        min=Math.min(n,min);
        max=Math.max(n,max);
        set.add(n);
       }

       for(int i=min;i<=max;i++){
            if(!set.contains(i))list.add(i);
       }
       return list;
    }
}