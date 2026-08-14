class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String>set=new HashSet<>();
        paragraph=paragraph.toLowerCase();
        for(String s:banned){
            set.add(s);
        }

        HashMap<String,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<paragraph.length();i++){
            char ch=paragraph.charAt(i);    
            if("!?',;.  ".indexOf(ch)!=-1){
                map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
                sb.setLength(0);
            }
             else{
                sb.append(ch);
            }
        }
        map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
          
        String maxFreq="";
        int max=0;
        System.out.println(map);
        for(Map.Entry<String,Integer>e:map.entrySet()){
            String s=e.getKey();
            if(set.contains(s) || s.length()<1) continue;
             if(max<e.getValue()){
                max=e.getValue();
                maxFreq=s;
             }
        }
        return maxFreq;
    }
}