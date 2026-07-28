class Solution {
    public String smallestPalindrome(String str) {

        int arr[]=new int[26];

        StringBuilder fr=new StringBuilder("");
        char mid='0';

        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            arr[idx]+=1;
        }

        for(int i=0;i<arr.length;i++){
            char ch=(char)(97+i);

            while(arr[i]>1){
                fr.append(ch);
                arr[i]-=2;
            }
            if(arr[i]%2!=0){
                mid=ch;
            }
        }
        StringBuilder bk=new StringBuilder(fr).reverse();
        
        if(mid!='0')fr.append(mid);
        fr.append(bk);
       return fr.toString();
    }
}