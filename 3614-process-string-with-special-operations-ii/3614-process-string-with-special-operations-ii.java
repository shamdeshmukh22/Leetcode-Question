class Solution {
    public char processStr(String s, long k) {
       long len=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='*' && len>0){
                len--;
           }
            else if(ch=='#'){
                len*=2;
            }
            else if(ch>='a'&& ch<='z')len++;
       }
      if(len<=k) return '.';
      for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        if(ch=='*')len++;
        else if(ch=='#'){
            long half=len/2;
            if(k>=half){
                k-=half;
            }
            len=half;

        }
        else if(ch=='%'){
            k=len-1-k;
        }
        else {
            if(k==len-1){
                return ch;
            }
            len--;
        }
      }
       return '.';
    }
}