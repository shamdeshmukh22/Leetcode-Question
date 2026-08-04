class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        while(i>=0){
           if(s.charAt(i)==' '){
             return s.length()-i-1;
           }
           i--;
        }
        return s.length();
    }
}