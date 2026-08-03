class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
          Arrays.sort(nums,(a,b)->{
           int result=Integer.compare(a.length(),b.length());
           if(result==0){
                 return a.compareTo(b);
           }
           return result;
          });
        //   for(String s:nums)System.out.print(s+" ");
          return nums[nums.length-k];
    }
}