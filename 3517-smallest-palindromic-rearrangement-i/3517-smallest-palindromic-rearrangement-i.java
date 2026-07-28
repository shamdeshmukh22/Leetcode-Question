class Solution {
    public String smallestPalindrome(String str) {

        int arr[]=new int[26];
        StringBuilder fr=new StringBuilder("");
        StringBuilder bk=new StringBuilder("");
        char mid='0';

        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            arr[idx]+=1;
        }

        for(int i=0;i<arr.length;i++){
            char ch=(char)(97+i);

            while(arr[i]>1){
                fr.append(ch);
                bk.append(ch);
                arr[i]-=2;
            }
            if(arr[i]%2!=0){
                mid=ch;
            }
        }
        if(mid!='0')fr.append(mid);
        fr.append(bk.reverse());
        
       return fr.toString();
    }
}