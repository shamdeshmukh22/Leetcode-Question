class Solution {
    public class Vowels{
    char ch;
    int count=0;
     int index;

    Vowels(char ch,int count,int index){
        this.count=count;
        this.ch=ch;
        this.index=index;
    }
}
    public String sortVowels(String str) {
        ArrayList<Vowels>list=new ArrayList<>();
       list.add( new Vowels('a',0,-1));
        list.add( new Vowels('e',0,-1));
        list.add( new Vowels('i',0,-1));
        list.add( new Vowels('o',0,-1));
        list.add( new Vowels('u',0,-1));
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
              int val=checkVowel(ch);
              if(val!=-1){
                  Vowels v=list.get(val);
                  if(v.index==-1)v.index=i;
                    v.count+=1;
              }
        }
        Collections.sort(list,(a,b)->{
           int result=Integer.compare(b.count,a.count);
           if(result==0){
            return Integer.compare(a.index,b.index);
           }
           return result;
            });

       
        StringBuilder sb=new StringBuilder("");
        int j=0;

      for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
           if(checkVowel(ch)!=-1){
               Vowels v=list.get(j);
             if(v.count!=0) sb.append(v.ch);
             else sb.append(ch);
               v.count-=1;
             if(v.count==0)j++;
           }else{
               sb.append(ch);
           }
      }
        return sb.toString();
    }
    public static int checkVowel(char ch){
        return "aeiou".indexOf(ch);
    }
}