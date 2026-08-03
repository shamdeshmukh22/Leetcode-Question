class CountFreq{
    int num,count;
    CountFreq(int num,int count){
        this.count=count;
        this.num=num;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,CountFreq>map=new HashMap<>();
         for(int n:nums){
            if(map.containsKey(n)){
                CountFreq c= map.get(n);
                c.count+=1;
            }
            else map.put(n,new CountFreq(n,1));
         }

         ArrayList<CountFreq>list=new ArrayList<>();
         map.forEach((a,b)->list.add(b));

         Collections.sort(list,(a,b)->Integer.compare(b.count,a.count));
          int arr[]=new int[k];
          
         for(int i=0;i<k;i++){
            arr[i]=list.get(i).num;
         }
         return arr;
    }
}
    