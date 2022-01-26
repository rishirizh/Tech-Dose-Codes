class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len<3)
            return res;
        for(int i=0;i<len-2;i++){
            if (i==0 || nums[i]!=nums[i-1]){
                int current_sum = nums[i];
                int low=i+1,high = len-1;
                while (low < high){
                    int val=current_sum+nums[low]+nums[high];
                    if (val == 0){
                        res.add(Arrays.asList(current_sum,nums[low],nums[high]));
                        low++;
                        while (low < high && nums[low]==nums[low-1]){
                            low++;
                        }
                    }
                    else if (val > 0){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            }
        }
        return res;
        
        
        
        
        
    }
}
