class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;

        while(i<j){
            while(i<j && !Character.isLetter(ch[i]))i++;
            while(i<j && !Character.isLetter(ch[j]))j--;
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
       StringBuilder sb=new StringBuilder("");
        for(char c:ch){
            sb.append(c);
        }
        return sb.toString();
    }
   
}