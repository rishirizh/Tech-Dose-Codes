class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // int n = 20;
        // for(int i=0;i<32;i++){
        //     int k = n&(1<<(31-i));
        //     System.out.println(Integer.toBinaryString(n)+"-"+Integer.toBinaryString(k));
        // }
        int c = 0;
        while (left!=right){
            left>>=1;
            right>>=1;
            c++;
        }
        int n = left&right;
        return n<<=c;
    }
}
