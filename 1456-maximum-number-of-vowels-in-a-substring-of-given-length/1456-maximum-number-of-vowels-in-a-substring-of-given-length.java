class Solution {
    public int maxVowels(String s, int k) {
           String vowels="aeiou";
          // int arr[]=new int[5];
           int i=0,j=0,max=0,count=0;

           while(i<s.length()){

               char ch=s.charAt(i);

               if(vowels.indexOf(ch)!=-1){
                     count+=1;
               }

               if(i==j+k-1){
                  max=Math.max(count,max);
                  if(vowels.indexOf(s.charAt(j))!=-1){
                       count-=1;  
                  }
                  j++;
               }
               i++;
           }

           return max;
    }
}