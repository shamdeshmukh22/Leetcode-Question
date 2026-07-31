class Solution {
    public int smallestValue(int n) {
         return FactorOfN(n,0);
    }
     private  int FactorOfN(int n,int prev) {
        if(prev==n) return n;
        prev=n;
        int sum=0;
       for(int i=2;i<=n;i++){
            while(n%i==0 && checkPrime(i)) {
                n/=i;
                sum+=i;
            }
        }
        return FactorOfN(sum,prev);
    }
    public  boolean checkPrime(int n){
        if(n==2 || n==3 || n==5 || n==7) return true;
        else if(n%2==0 ||  n<=1) return false;

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}