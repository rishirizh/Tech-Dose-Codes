class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> d = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            if (d.containsKey(target-nums[i])){
                return new int[]{d.get(target-nums[i]),i};
                
            }
            else{
                d.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
