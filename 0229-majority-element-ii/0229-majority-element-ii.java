class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      int count=nums.length/3;
      for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
            int key=map.get(nums[i])+1;
            map.put(nums[i],key);
           }
           else map.put(nums[i],1);
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