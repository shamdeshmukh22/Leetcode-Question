class Solution {
    public int maxNumberOfBalloons(String text) {
        String str="balloon";
        StringBuilder sb=new StringBuilder(text);
        char ch=str.charAt(0);
       int index= sb.indexOf(String.valueOf(ch)),count=0,i=0;
        while(index !=-1){
            if(i==str.length()-1){
            count++;
            i=-1;
           }
           ch=str.charAt(++i);
        sb.setCharAt(index,'#');
        index=sb.indexOf(String.valueOf(ch));
           
        }
        return count;
    }
}