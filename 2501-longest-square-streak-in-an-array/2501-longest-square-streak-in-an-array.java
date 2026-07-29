class Solution {
    public int longestSquareStreak(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:arr)set.add(n);

        int i=0,n=arr.length,max=0;
        while(i<n){
               int count=1;
                long val=1L*arr[i]*arr[i];
                while(val <= Integer.MAX_VALUE  && set.contains((int)val)){
                    val*=val;
                    count++;
                }
                max=Math.max(count,max);
                i++;
        }
       return  (max==1)? -1 :max;
    }
}