class Solution {
    public int compress(char[] ch) {
        int count=1,i=0,j=0;
        while(i<ch.length){
            while(i<ch.length-1 && ch[i]==ch[i+1]){
                i++;
                count++;
            }
            ch[j++]=ch[i];
            if(count!=1){
               String sb=String.valueOf(count);
            //System.out.println(ch[i]+" "+sb);
               for(int k=0;k<sb.length();k++){
                ch[j++]=sb.charAt(k);
               }
               count=1;
            }
            i++;
        }
        return j;
  }
}