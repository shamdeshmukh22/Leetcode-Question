class Solution {
    public String sortVowels(String s) {
        String str="AEIOUaeiou";
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(str.indexOf(ch)!=-1){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        
        StringBuilder sb=new StringBuilder("");
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(str.indexOf(ch)!=-1){
                while(!map.containsKey(str.charAt(j))){
                    j++;
                }
//                System.out.println(str.charAt(j));
                char vowel=str.charAt(j);
                sb.append(vowel);
                map.put(vowel,map.getOrDefault(vowel,0)-1);
//                System.out.println(map);
                if(map.get(vowel)==0)j++;
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}