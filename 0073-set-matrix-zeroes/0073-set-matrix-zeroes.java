class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
          boolean row[]=new boolean[n];
         boolean col[]=new boolean[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[j]=true;
                    col[i]=true;
                }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(row[j] || col[i])matrix[i][j]=0; 
            }
         }
    }
}