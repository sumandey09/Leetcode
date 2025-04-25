class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
           profit = Math.max(profit, prices[i] - mini);
           mini=Math.min(mini,prices[i]);
        }
       return profit;
    }
}