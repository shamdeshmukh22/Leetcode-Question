class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String str:words){
            if(str.length()>=k){
                String sub=str.substring(0,k);
                map.put(sub,map.getOrDefault(sub,0)+1);
            }
        }
        int count=0;
        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                count++;
            }
        }
        return count;
    }
}