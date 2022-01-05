// normal solution

class Solution {
    public int countSetBits(int n){
        int count = 0;
        while (n>0){
            count += (n&1);
            n>>=1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<=n;i++){
            result[i] = countSetBits(i);
        }
        return result;
        
    }
}


// DP solution

class Solution {
    
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        if (n==0){
            return result;
        }
        result[1] = 1;
        for(int i=2;i<=n;i++){
            if ((i&1)==1){
                result[i] = result[i>>1]+1; 
            }
            else{
                result[i] = result[i>>1];
            }
        }
        return result;
        
    }
}





