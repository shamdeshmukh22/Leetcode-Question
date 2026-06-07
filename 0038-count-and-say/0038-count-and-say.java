class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
       int i=0,j=0;
       String s=countAndSay(n-1)+"&";

       String ans="";
       while(i<s.length() && j<s.length()){
           if(s.charAt(i)==s.charAt(j)){
              j++;
           }else{
              ans+=j-i;
             ans+=s.charAt(i);
            i=j;
           }  
       }
       
       return ans;
    }
}