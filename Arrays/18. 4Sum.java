class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) 
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) 
                    continue;
                int low = j+1,high=n-1,sum;
                while (low < high){
                    sum = nums[i]+nums[j]+nums[low]+nums[high];
                    if (sum > target){
                        high--;
                    }
                    else if (sum < target){
                        low++;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                        while (low<high && nums[low]==nums[low-1]){
                            low++;
                        }
                        while (low<high && nums[high]==nums[high+1]){
                            high--;
                        }
                    }
                }
            }
        }
        return res;
    }
}
