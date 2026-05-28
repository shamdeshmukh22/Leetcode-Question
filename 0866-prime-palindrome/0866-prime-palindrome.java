class Solution {
    public static boolean checkPrime(int n){
        if(n==2) return true;
        if(n<2 || n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public static  boolean  checkPalindrome(int n){
        int prev=n,rev=0;
        while(n>0){
            rev=rev*10+ n%10;
            n/=10;
        }
        return prev==rev;
    }
    public int primePalindrome(int n) {
       for(int i=n;i<Integer.MAX_VALUE;i++){
         if(10000000 < i && i < 100000000)
                i = 100000000;
         if(checkPalindrome(i) && checkPrime(i)){
            return i;
         }
       }
       return -1;
    }
}