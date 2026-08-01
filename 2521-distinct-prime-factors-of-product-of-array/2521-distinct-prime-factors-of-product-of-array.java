class Solution {
    public int distinctPrimeFactors(int[] arr) {
        HashSet<Integer>set=new HashSet<>();

        for(int n:arr){
             for(int i=2;i*i<=n;i++){
                while(n%i==0){
                    n/=i;
                    set.add(i);
                }
             }
             if(n>1)set.add(n);
        }
        return set.size();
    }
    
}