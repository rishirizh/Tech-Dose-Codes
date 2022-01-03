class Solution {
    public int hammingDistance(int x, int y) {
        int n = x^y,n1=0,c=0;
        while (n>0 && n1<32){
            if ( (x&(1<<n1)) != (y&(1<<n1))){
                c++;
            }
            n1++;
        }
        
        return c;
        
        
    }
}
