class Solution {
    public int maxArea(int[] height) {
        int max=0,i=0,j=height.length-1;
        while(i<j){
            int len=Math.min(height[i],height[j]),bre=j-i;
            max=Math.max(len*bre,max);
            if(height[i]<height[j])i++;
            else j--;
        }
        return max;
    }
}