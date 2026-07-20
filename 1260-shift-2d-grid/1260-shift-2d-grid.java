class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,r=grid[0].length;
        int n=m*r;
        if(k>=n) k%=n;
        List<List<Integer>>list=new ArrayList<>();
        ArrayList<Integer>part=new ArrayList<>();

        int arr[]=new int[n];
       int i=0,j=0,idx=0;
        while(i<grid.length){
             j=0;
             while(j<grid[0].length){
                   arr[idx++]=grid[i][j];
                j++;
             }
             i++;
        }
        // list.add(sub);
        for(i=n-k;i<n;i++){
            part.add(arr[i]);
            if(part.size()==r){
                list.add(part);
                part=new ArrayList<>();
            }
        }
        for( i=0;i<n-k;i++){
            part.add(arr[i]);
            if(part.size()==r){
                list.add(part);
                part=new ArrayList<>();
            }
        }
        return list;
    }
}