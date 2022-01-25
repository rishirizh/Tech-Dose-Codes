class Solution {
    public void reverse(int[] nums, int a, int b) {
        for(int i=a, j=b; i<j; i++, j--) {
            swap(nums, i, j);
        }
    }
    public void swap(int[] nums,int i,int j){
        nums[i]^=nums[j];
        nums[j]^=nums[i];
        nums[i]^=nums[j];
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len<=1)
            return;
        int peak = -1,i=1;
        while (i < len){
            if (nums[i] > nums[i-1])
                peak = i;
            i++;
        }
        if (peak==-1){
            reverse(nums, 0, len-1);
            return; 
        }
        int idx = peak;
        for(int k=peak+1;k<len;k++){
            if (nums[k] > nums[peak-1] && nums[k]<nums[idx]){
                idx = k;
            }
        }
        swap(nums,peak-1,idx);
        Arrays.sort(nums,peak,len);
        
        
    }
}
