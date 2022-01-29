class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int len = nums1.length;
        for(int num: nums2){
            while (!stack.empty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<len;i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        
        return nums1;
    }
}
