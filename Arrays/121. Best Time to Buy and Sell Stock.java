class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length,low = 0,high = 1,max=0,val;
        if (len==1)
            return 0;
        while (high < len){
            if (prices[low] < prices[high]){
                val = prices[high]-prices[low];
                max = Math.max(max,val);
            }
            else{
                low = high;
            }
            high++;
            
        }
        return max;
    }
}
