class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       StringBuilder sb=new StringBuilder(magazine);
       for(int i=0;i<ransomNote.length();i++){
        String ch=String.valueOf(ransomNote.charAt(i));
        if(sb.indexOf(ch) != -1){
           sb.setCharAt(sb.indexOf(ch), '!');
        }
        else return false;
       }
       return true;
    
    }

}