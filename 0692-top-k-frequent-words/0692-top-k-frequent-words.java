class countFrequecy{
    String word;
    int count;
    countFrequecy(String word,int count){
        this.word=word;
        this.count=count;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,countFrequecy>map=new HashMap<>();
        
        for(String str:words){
            if(map.containsKey(str)){
                countFrequecy c=map.get(str);
                c.count+=1;
            }
            else map.put(str, new countFrequecy(str,1));
        }

        ArrayList<countFrequecy>list=new ArrayList<>();

        map.forEach((a,b)->list.add(b));
        Collections.sort(list,(a,b)->{
            int result=Integer.compare(b.count,a.count);
            if(result==0){
                return a.word.compareTo(b.word);
            }
            return result;
        });

        ArrayList<String>str=new ArrayList<>();
        for(int i=0;i<k;i++){
            str.add(list.get(i).word);
        }
        
        return str;
    }
}
