class Solution {
    public int FindSum(int start,int n){
        int last=start+(n-1)*2;
        int sum=n*(start+last)/2;
        // System.out.println(last);
        return sum;
    }
    public int gcdOfOddEvenSums(int n) {
       return FindGCDOfNumber(FindSum(2,n),FindSum(1,n));
        
    }
    public int FindGCDOfNumber(int a,int b){
        if(a==0) return b;
        return FindGCDOfNumber(b%a,a);
    }
}