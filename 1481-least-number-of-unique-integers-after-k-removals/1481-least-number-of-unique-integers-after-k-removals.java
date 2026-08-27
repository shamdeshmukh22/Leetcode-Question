class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        ArrayList<Integer>list=new ArrayList<>(map.values());

        int count=0;
        Collections.sort(list);

        for(int i:list){
            // int n=list.get(i);
            if(k>i){
                k-=i;
                i=0;
            }
            else{
                i-=k;
                k=0;
            }

            if(i!=0) count++;
        }
        return count;
    }
}