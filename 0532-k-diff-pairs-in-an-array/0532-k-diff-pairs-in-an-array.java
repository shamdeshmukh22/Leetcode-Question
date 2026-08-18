class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int count=0;
       // System.out.println(map);
        for(int n:nums){
            int val=n+k;
            if(k==0){
                  if(map.get(n)>1){
                    map.put(n,0);
                     count++;
               }
            }
            else if(map.containsKey(val) && map.get(val)>0){
                String str=String.valueOf(Math.min(val,n)+""+Math.max(val,n));
                  set.add(str);
                map.put(val,map.getOrDefault(val,0)-1);
            }
        }

        return count+set.size();
    }
}