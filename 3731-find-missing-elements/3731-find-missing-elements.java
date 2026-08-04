class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        
        int min=nums[0],max=nums[0];

        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
            arr.add(n);
        }
        
        for(int i=min;i<=max;i++){
            if(!arr.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}