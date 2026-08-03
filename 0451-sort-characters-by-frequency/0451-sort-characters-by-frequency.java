class CountCharFreq{
    char ch;
    int freq;
    CountCharFreq(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,CountCharFreq>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
              if(map.containsKey(ch)){
                  CountCharFreq c= map.get(ch);
                  c.freq+=1;
              }
              else map.put(ch,new CountCharFreq(ch,1));
        }
        
        StringBuilder sb=new StringBuilder("");
        ArrayList<CountCharFreq>list=new ArrayList<>();
              
        map.forEach((a,b)->list.add(b));
        Collections.sort(list,(a,b)->Integer.compare(b.freq,a.freq));

        for(int i=0;i<list.size();i++){
            CountCharFreq c=list.get(i);
            sb.repeat(c.ch,c.freq);
        }

        return sb.toString();
    }
}