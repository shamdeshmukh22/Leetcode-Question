class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        int i=0;
        while(i<arr.length){
            
            int left=i,right=i;
             while(left>0 && arr[left] >arr[left-1]){
                left--;
             }
             while(right<arr.length-1 && arr[right]>arr[right+1]){
                right++;
             }
            if(left!=i && right!=i) {
                max=Math.max(max,right-left+1);
                i=right-1;
             }
             i++;
        }
        return max;
    }
}