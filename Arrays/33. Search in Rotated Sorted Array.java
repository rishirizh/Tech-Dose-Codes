class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int low = 0,high = len-1,mid;
        while (low <= high){
            mid = low+(high-low)/2;
            
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>=nums[low]){
                if (target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if (target>=nums[mid] && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
