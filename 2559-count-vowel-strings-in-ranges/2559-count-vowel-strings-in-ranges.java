class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int count[]=new int[words.length];
        
        HashSet<Character>set=new HashSet<>(Set.of('a','e','i','o','u'));
        int total=0;
        
        for(int i=0;i<words.length;i++){
            String str=words[i];
            char ch=str.charAt(0),ch2=str.charAt(str.length()-1);
            if(set.contains(ch) && set.contains(ch2)) total++;
            count[i]=total;
        }
      
       int arr[]=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int start=queries[i][0],end=queries[i][1];
            int firstpart=(start>0)?count[start-1] :0;
            arr[i]=count[end]-firstpart;

        }
        return arr;
    }
}