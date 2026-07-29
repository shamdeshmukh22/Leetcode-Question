class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i :nums){
            set.add(i);
            if(i>9)set.add(reverseInteger(i));
        }
        return set.size();
    }
    public int reverseInteger(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}