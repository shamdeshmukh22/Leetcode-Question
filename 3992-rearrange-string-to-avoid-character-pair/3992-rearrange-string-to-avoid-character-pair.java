class Solution {
    public String rearrangeString(String s, char x, char y) {
        int countX=0,countY=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==x)countX++;
            else if(ch==y)countY++;
            else sb.append(ch);
        }
        StringBuilder ans=new StringBuilder("");
        while(countY>0){
              ans.append(y);
            countY--;
        }
        ans.append(sb);
        while(countX>0){
              ans.append(x);
            countX--;
        }
        return ans.toString();
    }
}