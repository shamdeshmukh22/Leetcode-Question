class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer>freq=new HashMap<>();
      
       for(int i:map.values()){
            freq.put(i,freq.getOrDefault(i,0)+1);
       }
    
       for(int i:nums){
          int val=map.get(i);
          if(freq.get(val)==1){
               return i;
          }
       }
       return -1;
    }
}
