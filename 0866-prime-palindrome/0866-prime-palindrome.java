class Solution {
    public boolean CheckPrime(long num){
        if(num==2) return true;
        if(num%2==0||num<2) return false;
        for(long i=3;i*i<=num;i+=2){
            if(num%i==0) return false;
        }
        return true;
    }
    public boolean checkPalindrome(int n){
        int rev=0;
        int prev=n;
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
            if(checkPalindrome(i) && CheckPrime(i) ) return i;
        }
         return -1;
    }
}