class Solution {
    public int maxFreqSum(String s) {
        int first=0,second=0;
        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
             int idx=s.charAt(i)-'a';
            //  System.out.println(idx);
             arr[idx]+=1;
        }
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 ||i==20 || i==14 ){
                first=Math.max(first,arr[i]);
            }
            else{
                 second=Math.max(second,arr[i]);
            }
        }
        return first+second;

    }
}