class Solution {
    public int maxProduct(int n) {
        int arr[]=new int[String.valueOf(n).length()];
        int product=1,i=0;
        while(n>0){
           arr[i++]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        i=arr.length-1;
        return arr[i]*arr[i-1];
    }
}