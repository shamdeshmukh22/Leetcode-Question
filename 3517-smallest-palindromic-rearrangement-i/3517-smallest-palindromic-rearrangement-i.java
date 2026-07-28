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
            while(arr[i]>1){
                fr.append((char)(97+i));
                bk.append((char)(97+i));
                arr[i]-=2;
            }
            if(arr[i]%2!=0){
                mid=(char)(97+i);
            }
        }
        if(mid!='0')fr.append(mid);
        fr.append(bk.reverse());
       return fr.toString();
    }
}