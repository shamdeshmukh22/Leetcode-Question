class Solution {
    public int[] sortArray(int[] nums) {
        SplitArray(nums);
        return nums;
    }
    public void SplitArray(int arr[]){
        int n=arr.length;
        if(n==1) return;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
         int i=0;
         while(i<n/2){
            a[i]=arr[i];
            i++;
         }
         while(i<n){
            b[i-n/2]=arr[i];
            i++;
         }
         SplitArray(a);
         SplitArray(b);
         mergeArray(a,b,arr);

    }
    public void mergeArray(int a[],int b[],int arr[]){
        int k=0,i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[k]=a[i++];
            }
            else arr[k]=b[j++];
            k++;
        }
        while(i<a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++];
    }
}