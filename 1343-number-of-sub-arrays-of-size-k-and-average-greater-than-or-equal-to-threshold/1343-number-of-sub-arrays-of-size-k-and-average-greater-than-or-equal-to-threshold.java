class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      long sum=0;
      int i=0,count=0;

       while(i<k){
        sum+=arr[i];
        i++;
       }
       if(sum/k>=threshold)count++;
       while(i<arr.length){
        
        sum-=arr[i-k];
        sum+=arr[i];

       if(sum/k>=threshold){
        count++;
        }
        i++;
       }
      return count;  
    }
}