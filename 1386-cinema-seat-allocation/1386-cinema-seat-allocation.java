class Solution {
   public int maxNumberOfFamilies(int n, int[][] reserved) {
    HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
    //Arrays.sort(reserved,(a,b)->Integer.compare(a[0],b[0]))
            int i=0;
            while(i<reserved.length){
                int row=reserved[i][0];
               if(map.containsKey(row)){
                 HashSet<Integer>set=map.get(row);
                set.add(reserved[i][1]);
                 map.put(row,set);
               }
               else{
                HashSet<Integer>set=new HashSet<>();
                set.add(reserved[i][1]);
                 map.put(row,set);
                 }
                 i++;
            }
            int count=(n - map.size()) * 2;

            for(Map.Entry<Integer,HashSet<Integer>>e:map.entrySet()){
                HashSet<Integer>set=e.getValue();
                int row=0;
                for(int j=1;j<=10;j++){

                    if(set.contains(j))row=0;
                    else if(row==0 && (j==2 || j==4 || j==6)) row++;
                    else if(row!=0) row++;
                    
                    if(row==4){
                        count++;
                        row=0;
                    }
                }
            }
            return count;
     }
}