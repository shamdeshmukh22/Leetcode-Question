class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length,duplicate=-1;
        int arr[]=new int[n*n];
        int mul=n*n;
        long totalSum=mul*(mul+1)/2,currSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            int val=grid[i][j]-1;
               if(arr[val]!=0)duplicate=val+1;
               else arr[val]+=1;
               currSum+=(val+1);
        }
    }
        currSum-=duplicate;
        return new int[]{duplicate,(int)(totalSum-currSum)};
    }
}