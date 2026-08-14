class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0,max=0;
        int arr[]=new int[26];

         while(i<s.length()){
            int idx=s.charAt(i)-'a';
            arr[idx]+=1;
            while(arr[idx]>2){
                int prev=s.charAt(j)-'a';
                 arr[prev]-=1;
                 j++;
            }
            max=Math.max(max,i-j+1);
            i++;
         }
         
        return max;
    }
}