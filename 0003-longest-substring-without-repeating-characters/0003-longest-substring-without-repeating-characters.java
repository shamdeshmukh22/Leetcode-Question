class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,len=0;
        HashSet<Character>set=new HashSet<>();
           while(i<s.length()){
             char ch=s.charAt(i);
             while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
             }
             len=Math.max(len,i-j+1);
             set.add(ch);
             i++;
           }
        return len;
    }
}