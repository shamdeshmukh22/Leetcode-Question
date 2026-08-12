class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0,j=0,len=0;
        while(i<nums.length){
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
               while(map.get(nums[i])>k){
                     map.put(nums[j],map.getOrDefault(nums[j],0)-1);
                    j++;
                }
            len=Math.max(len,i-j+1);
            i++;
        }
        return len;
    }
}