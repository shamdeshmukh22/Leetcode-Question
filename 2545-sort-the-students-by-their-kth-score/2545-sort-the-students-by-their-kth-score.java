class Matrix{
    int id,num;
    Matrix(int id,int num){
        this.id=id;
        this.num=num;
    }
}
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m=score.length,n=score[0].length;

        int nums[][]=new int[m][n];
        ArrayList<Matrix>list=new ArrayList<>();

        for(int i=0;i<m;i++){
            list.add(new Matrix(i,score[i][k]));
        }
        Collections.sort(list,(a,b)-> Integer.compare(b.num,a.num));

        for(int i=0;i<m;i++){
            Matrix mat=list.get(i);
            for(int j=0;j<n;j++){
                nums[i][j]=score[mat.id][j];
            }
        }
        return nums;
    }
}