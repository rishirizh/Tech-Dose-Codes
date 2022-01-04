class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int zeros=0,ones=0;
        for(int i=0;i<len;i++){
            if (nums[i]==0)
                zeros++;
            else if (nums[i]==1)
                ones++;
        }
        int i=0;
        for(;i<zeros;i++){
            nums[i]=0;
        }
        for(;i<zeros+ones;i++){
            nums[i]=1;
        }
        for(;i<len;i++){
            nums[i]=2;
        }
    }
}
