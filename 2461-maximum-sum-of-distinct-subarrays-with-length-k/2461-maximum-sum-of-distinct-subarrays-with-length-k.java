class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long prevSum=0,max=0;
        HashMap<Integer,Integer>map=new  HashMap<>();

        for(int i=0;i<k;i++){
            prevSum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k)max=prevSum;

        for(int i=k;i<nums.length;i++){
            int prev=nums[i-k],curr=nums[i];

            map.put(prev,map.getOrDefault(prev,0)-1);
            if(map.get(prev)==0)map.remove(prev);
            prevSum-=prev;
            prevSum+=curr;
            map.put(curr,map.getOrDefault(curr,0)+1);

            if(map.size()==k) max=Math.max(max,prevSum);
        }

        return max;
    }
}