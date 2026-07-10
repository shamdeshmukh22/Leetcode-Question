class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      int count=nums.length/3;
      for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int val = entry.getValue();
            if (val > count) {
                list.add(element);
            }
        }
        return list;
    }
}