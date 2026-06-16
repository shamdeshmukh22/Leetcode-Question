class Solution {
    public String processStr(String s) {
        StringBuilder sb= new StringBuilder("");

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch=='*' && sb.length()>0){
               sb.deleteCharAt(sb.length() - 1); 
            }
            else if(ch=='#'){
                String str=sb.toString();
                sb=new StringBuilder(str.repeat(2));
            }
            else if(ch=='%'){
                sb=new StringBuilder(sb.reverse());
            }
        }
        return sb.toString();
    }
}