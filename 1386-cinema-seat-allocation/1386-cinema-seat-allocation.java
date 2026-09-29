class Solution {
   public int maxNumberOfFamilies(int n, int[][] reserved) {
      HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
      for(int i=0;i<reserved.length;i++){
        int curr=reserved[i][0];
        if(map.containsKey(curr)){
            HashSet<Integer>set=map.get(curr);
            set.add(reserved[i][1]);
            map.put(curr,set);
        }
        else{
            HashSet<Integer>set=new HashSet<>();
            set.add(reserved[i][1]);
            map.put(curr,set);
        }
      }
      int count=(n-map.size())*2;
    //   System.out.println(count);
       for(Map.Entry<Integer,HashSet<Integer>> e:map.entrySet()){
           HashSet<Integer>set=map.get(e.getKey());
            int temp=0;
            for(int j=2;j<10;j++){
                if(set.contains(j)){
                    temp=0;
                }
                else temp++;
               
               if(temp>=4 && j!=8 && j!=6){
                  count++;
                  temp=0;
               }

            }
       }
      return count;
      
  }
}