//Method 1
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


// Method 2

        int i=m-1,j=n-1,k=m+n-1;
        while (i>=0 && j>=0){
            if (nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while (i>=0){
            nums1[k--] = nums1[i--];
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }
