class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder("");
        for(String str:words){
            int sum=0;
            for(int i=0;i<str.length();i++){
                int val=str.charAt(i)-97;
                sum+=weights[val];
            }
            sum%=26;
            sb.append((char)(122-sum));
        }
        return sb.toString();
    }
}