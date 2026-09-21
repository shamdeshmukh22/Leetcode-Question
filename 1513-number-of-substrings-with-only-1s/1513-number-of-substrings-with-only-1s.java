class Solution {
    public int numSub(String s) {
        int i=0,j=0;
        long count=0;
        while(i<s.length()){
            j=i;
            while(i<s.length() && s.charAt(i)=='1'){
                i++;
            }
          if(i!=j){
            int diff=i-j;
            count+=(diff*(diff+1))/2;
            count%=1000000007;
           }
        i++;
        }
        return (int)count;
    }
}