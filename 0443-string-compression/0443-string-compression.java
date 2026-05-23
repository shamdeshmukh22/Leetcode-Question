class Solution {
    public int compress(char[] chars) {
       int count=1,k=0;
       for(int i=0;i<chars.length;i++){
           while(i<chars.length-1 && chars[i]==chars[i+1]){
                   i++;
                   count++;
           }
           chars[k++]=chars[i];
           if(count>1){
               StringBuilder sb=new StringBuilder(count+"");
            //    sb=sb.reverse();
               int j=0;
               while(j<sb.length()){
                     chars[k++]=sb.charAt(j);
                     j++;
               }
            //    System.out.println(rev);
           }
           count=1;
       }
       return k;
    }
}