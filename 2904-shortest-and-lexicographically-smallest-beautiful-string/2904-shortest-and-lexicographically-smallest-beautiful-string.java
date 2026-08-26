class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0,j=0,count=0;
        String str="";

        while(i<s.length()){
            int curr=s.charAt(i)-'0';
            if(curr==0){
                i++;
                continue;
            }
            count++;
            while(count>k){
                if(s.charAt(j)=='1')count--;
                j++;
            }

            if(count==k){
                while(j<i && s.charAt(j)=='0'){
                    j++;
                }
                String c=s.substring(j,i+1);
                if(str=="")str=c;
                else str=CompareString(str,c);
            }
            i++;
        }

        return str;
    }
    public String CompareString(String s1,String s2){
        int n=Integer.compare(s1.length(),s2.length());
        if(n==-1){
            return s1;
        }
        else if(n==1){
            return s2;
        }
        return s1.compareTo(s2) <=0 ? s1:s2;
    }
}