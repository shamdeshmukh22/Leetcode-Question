class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        mergeSortAlgorithm(nums);
        int diff=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            diff=Math.max(diff,nums[i]-nums[i-1]);
        }
        return diff;
    }
    public void mergeSortAlgorithm(int arr[]){
        int n=arr.length,k=0;
        if(n==1) return;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
       
        for(int i=0;i<a.length;i++){
            a[i]=arr[k++];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[k++];
        }
        mergeSortAlgorithm(a);mergeSortAlgorithm(b);
        mergeArray(a,b,arr);
    }
    public void mergeArray(int a[],int b[],int arr[]){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else arr[k++]=b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
}