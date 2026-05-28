class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
             int val=(s.charAt(i))-'a';
            arr[val]=arr[val]+1;
        }
        for(int i=0;i<s.length();i++){
             int val=(s.charAt(i))-'a';
          if(arr[val]==1) return i;
        }
        return -1;
    }
}