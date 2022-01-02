class Solution {
    public int majorityElement(int[] nums) {
        int currentElement = nums[0],count=1,len = nums.length;
        for(int i=1;i<len;i++){
            if (currentElement==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if (count==0){
                currentElement = nums[i];
                count=1;
            }
        }
        return currentElement;
    }
}
