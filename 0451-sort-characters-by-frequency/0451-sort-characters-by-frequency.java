class CountCharacter{
    char ch;
    int count;
    CountCharacter(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,CountCharacter>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(map.containsKey(ch)){
                  CountCharacter c=map.get(ch);
                  c.count+=1;
             }
             else{
                map.put(ch, new CountCharacter(ch,1));
             }
        }
        ArrayList<CountCharacter>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        map.forEach((a,b)->list.add(b));
        Collections.sort(list,(a,b)->Integer.compare(b.count,a.count));
        for(int i=0;i<list.size();i++){
             CountCharacter c= list.get(i);
             sb.repeat(c.ch,c.count);
        }
        return sb.toString();
    }
}