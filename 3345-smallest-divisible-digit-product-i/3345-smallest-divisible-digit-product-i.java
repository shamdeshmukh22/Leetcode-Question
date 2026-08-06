class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int num=n,rem=1;
            while(num>0){
               rem*=(num%10);
               num/=10;
            }
            if(rem%t==0) return n;
            n++;
        }
    }
}