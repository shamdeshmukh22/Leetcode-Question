class Solution {
    public int longestBeautifulSubstring(String word) {
        int i=0,j=0,max=0;
        char prev='0';
        while(i<word.length()){
            char ch=word.charAt(i);
            if(prev==ch || CheckPrevAndCurrent(prev,ch)){
            if(ch=='u')max=Math.max(max,i-j+1);
            prev=ch;
            }
            else{
                if(ch=='a'){
                    prev='a';
                    j=i;
                }
                else {
                    j=i+1;
                    prev='0';
                }
            }
            i++;
        }
        return max;
    }
    public boolean CheckPrevAndCurrent(char prev,char next){
        if(prev=='0' && next=='a') return true;
       else if(prev=='a' && next=='e') return true;
       else if(prev=='e' && next=='i') return true;
      else  if(prev=='i' && next=='o') return true;
      else  if(prev=='o' && next=='u') return true;
      return false;
    }
}