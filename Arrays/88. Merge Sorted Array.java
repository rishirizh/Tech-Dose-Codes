class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m-1,len=nums1.length;
        for(int i=n-1;i>=0;i--){
            j = m-1;
            while (j>=0 && nums1[j] > nums2[i]){
                j--;
            }
            int t2 = j+1;
            for(int t1=len-1;t1>t2;t1--){
                nums1[t1] = nums1[t1-1];
            }
            nums1[j+1] = nums2[i];
            m++;
        }
    }
}
