class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int n:nums){
            if(n%2==1)continue;
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if(map.size()==0) return -1;
        int max=0,num=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            int val=e.getValue();
             if(max<=val){
                if(max==val){
                     num=Math.min(num,e.getKey());
                }
                else{
                max=val;
                num=e.getKey();
                }
             }
        }
        return num;

    }
}