class Solution {
    public String removeStars(String s) {
       int i=0;
       StringBuilder sb=new StringBuilder("");
       while(i<s.length()){
        char ch=s.charAt(i);
           if(ch=='*'){
                  sb.deleteCharAt(sb.length()-1);
           }
           else sb.append(String.valueOf(ch));
           i++;
       }
       return sb.toString();
        
    }
}