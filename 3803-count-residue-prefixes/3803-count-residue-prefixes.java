class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character>set=new HashSet<>();
        int i=0,count=0;
        for(i=0;i<s.length();i++){
            set.add(s.charAt(i));
            if((i+1)%3==set.size()){
                count++;
            }
        }
        return count;
    }
}