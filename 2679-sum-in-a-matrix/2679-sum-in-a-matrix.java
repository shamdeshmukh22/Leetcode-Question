class Solution {
    public int matrixSum(int[][] nums) {
        int sum=0,col=nums.length,row=nums[0].length-1;
        for(int i=0;i<col;i++){
            Arrays.sort(nums[i]);
        }
        while(row>=0){
            int i=1,max=nums[0][row];
            while(i<col){
                max=Math.max(nums[i][row],max);
                i++;
            }
            sum+=max;
            row--;
        }
        return sum;
    }
}