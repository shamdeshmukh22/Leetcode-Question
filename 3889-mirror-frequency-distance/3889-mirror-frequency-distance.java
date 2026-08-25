class Solution {
    public int mirrorFrequency(String s) {
        int letter[]=new int[26];
        int num[]=new int[10];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                letter[ch-'a']++;
            }
            else{
                num[ch-'0']++;
            }
        }
        
        int count=0;

        for(int i=0;i<26;i++){
            if(letter[i]!=0){
                count+=Math.abs(letter[i]-letter[25-i]);
                letter[i]=0;
                letter[25-i]=0;
            }
      }

      for(int i=0;i<10;i++){
        if(num[i]!=0){
            count+=Math.abs(num[i]-num[9-i]);
            num[i]=0;
            num[9-i]=0;
        }
      }

        return count;
    }
}