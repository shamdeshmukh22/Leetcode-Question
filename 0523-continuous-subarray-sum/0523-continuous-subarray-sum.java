class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
          HashMap<Integer,Integer>map=new HashMap<>();
          int sum=0,i=0;

          while(i<nums.length){
            sum+=nums[i];
            sum%=k;

            if(sum==0 && i>0) return true;
            if(map.containsKey(sum)){
                int idx=map.get(sum);
                if(i-idx>1) return true;
            }
            else{
                map.put(sum,i);
            }
            i++;
          }
          return false;
    }
}