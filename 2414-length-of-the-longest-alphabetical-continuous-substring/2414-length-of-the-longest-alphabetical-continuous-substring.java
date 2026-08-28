class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1,max=1;
         for(int i=1;i<s.length();i++){
            int curr=s.charAt(i)-'a',prev=s.charAt(i-1)-'a';
            if(prev+1==curr){
                count++;
             max=Math.max(count,max);
            }
            else{
            count=1;
            }
         }
            max=Math.max(count,max);
          return max;
    }
}