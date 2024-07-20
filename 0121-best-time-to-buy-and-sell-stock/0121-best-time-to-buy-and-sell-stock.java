class Solution {
    public int maxProfit(int[] prices) {
        int res=0,mn=prices[0];
        for(int i=0;i<prices.length;i++){
            mn=Math.min(prices[i],mn);
            res=Math.max(prices[i]-mn,res);
        }
        return res;
    }
}