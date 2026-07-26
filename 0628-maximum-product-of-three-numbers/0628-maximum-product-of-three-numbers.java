class Solution {
    public int maximumProduct(int[] arr) {
        int n=arr.length-1;
        Arrays.sort(arr);
        int max=arr[0]*arr[1]*arr[arr.length-1];
    int product=arr[n]*arr[n-1]*arr[n-2];
        return Math.max(max,product);
    }
}