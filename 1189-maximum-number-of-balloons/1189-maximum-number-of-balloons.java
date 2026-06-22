class Solution {
    public int maxNumberOfBalloons(String text) {
        String str="balloon";
        int count=0,i=0;
        char ch=str.charAt(0);
        StringBuilder sb=new StringBuilder(text);
       int index= sb.indexOf(ch+"");
        while(index !=-1){
            if(i==str.length()-1){
            count++;
            i=-1;
           }
           ch=str.charAt(++i);
        sb.deleteCharAt(index);
        index=sb.indexOf(ch+"");
           
        }
        return count;
    }
}