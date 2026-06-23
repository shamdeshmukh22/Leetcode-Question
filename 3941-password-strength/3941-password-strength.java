class Solution {
    public int passwordStrength(String password) {
        int strength=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(! set.contains(ch)){
                if(ch>='a'&& ch<='z')strength+=1;
               else if(ch>='A'&& ch<='Z')strength+=2;
               else if(ch>='0'&& ch<='9')strength+=3;
               else if(ch=='!' || ch=='@' ||  ch=='#' ||ch=='$')strength+=5;
                set.add(ch);
            }
        }
        return strength;
    }
   
}