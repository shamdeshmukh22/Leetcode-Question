class Solution {
    public long sumAndMultiply(int n) {
        long sum=0,rev=0,num=0;
        while(n>0){
             int rem=n%10;
             if(rem!=0){
                rev=rev*10+rem;
                sum+=rem;
             }
             n/=10;
        }
        while(rev>0){
            num=num*10+rev%10;
            rev/=10;
        }
        return num*sum;
    }
}