class Solution {
    public int maxVowels(String s, int k) {
           String vowels="aeiou";
           int arr[]=new int[5];
           int i=0,j=0,max=0,count=0;
           while(i<s.length()){
               char ch=s.charAt(i);
               int idx=vowels.indexOf(ch);
               if(idx!=-1){
                 arr[idx]+=1;
               }
               if(i==j+k-1){
                  int sum=0;
                  for(int n:arr){sum+=n;};
                  max=Math.max(sum,max);
                  int id=vowels.indexOf(s.charAt(j));
                  if(id!=-1){
                       arr[id]-=1;  
                  }
                  j++;
               }
               i++;
           }
           return max;
    }
}