class Solution {
    public boolean checkPrime(int n){
        if(n==2) return true;
        if(n%2==0 || n<=1) return false;
        
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int count=0,i=0;

        while(i<nums.length){
               int n=nums[i];
               if(i%2==0){
                    while(!checkPrime(n)){
                        n+=1;
                        count+=1;
                    }
               }
               else{

                    while(checkPrime(n)){
                        n+=1;
                        count+=1;
                    }
               }
               i++;
        }
        return count;
    }
}