class CountFreq{
    char ch;
    int freq;
    CountFreq(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,CountFreq>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                CountFreq c=map.get(ch);
                c.freq+=1;
            }
            else {
                map.put(ch,new CountFreq(ch,1));
            }
        }
        ArrayList<CountFreq>list=new ArrayList<>();
       StringBuilder sb=new StringBuilder("");

        map.forEach((a,b)->list.add(b));
        Collections.sort(list,(a,b)->Integer.compare(b.freq,a.freq));
          
        for(int i=0;i<list.size();i++){
            CountFreq c=list.get(i);
            sb.repeat(c.ch,c.freq);
        }
        return sb.toString();
    }
}