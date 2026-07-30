class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            String rev=new StringBuilder(arr[i]).reverse().toString();
            sb.append((i==arr.length-1) ? rev : rev+" ");
        }
       return sb.toString();
    }
}