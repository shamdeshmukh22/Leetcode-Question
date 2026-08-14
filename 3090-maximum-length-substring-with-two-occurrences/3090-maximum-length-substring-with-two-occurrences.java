class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0,max=0;
        HashMap<Character,Integer>map=new HashMap<>();
         while(i<s.length()){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char prev=s.charAt(j);
                 map.put(prev,map.getOrDefault(prev,0)-1);
                 j++;
            }
            max=Math.max(max,i-j+1);
            i++;
         }
        return max;
    }
}