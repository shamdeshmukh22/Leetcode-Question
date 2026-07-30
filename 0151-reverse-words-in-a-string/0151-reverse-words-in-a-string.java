class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String str[]=s.split(" ");
        int i=0,j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;j--;
        }
        StringBuilder sb=new StringBuilder("");
        for(String t:str){
          if(t.length()>0)sb.append(t+" ");
        }
        return sb.toString().trim();
    }
}